package com.catcher.tccAtomikosXA;

import org.apache.shardingsphere.driver.api.ShardingSphereDataSourceFactory;
import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.apache.shardingsphere.transaction.core.TransactionTypeHolder;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AtomikosXATransaction {

    public static void main(String[] args){

        Connection connection = null;
        try {
            DataSource dataSource = getDatasource();
            TransactionTypeHolder.set(TransactionType.XA);
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            truncateTable(connection);
            updateTable(connection, 0);
            listTable(connection);
            updateTable(connection, 5);
            listTable(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static DataSource getDatasource() throws IOException, SQLException {
        File file = new File("src/main/resources/shardingsphere-config.yaml");
        DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(file);
        return dataSource;
    }

    public static void truncateTable(Connection connection){
        PreparedStatement preparedStatement = null;
        //clear table
        String clearSql = "truncate table  t_order";
        try {
            preparedStatement = connection.prepareStatement(clearSql);
            preparedStatement = connection.prepareStatement(clearSql);//建立执行对象
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void listTable(Connection connection){
        PreparedStatement preparedStatement = null;
        String searchSql = "SELECT * FROM t_order";
        try {
            preparedStatement = connection.prepareStatement(searchSql);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                System.out.println(resultSet.getObject(1).toString()+"-"
                        +resultSet.getObject(2).toString()+"-"+resultSet.getObject(3).toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void updateTable(Connection connection, int start) {
        PreparedStatement preparedStatement = null;
        //insert
        String updateSql = "INSERT INTO t_order (order_id, user_id, status) values (?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(updateSql);
            for (int i = start; i < start + 10; i++){
                preparedStatement.setInt(1, i);
                preparedStatement.setInt(2, i);
                preparedStatement.setString(3, "test" + i);
                preparedStatement.executeUpdate();
            }
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
