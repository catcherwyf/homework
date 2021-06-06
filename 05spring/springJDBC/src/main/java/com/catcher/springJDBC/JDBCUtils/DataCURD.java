package com.catcher.springJDBC.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataCURD {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
    try {
            //connection = JDBCConnect.getConnect();//jdbc建立数据库连接
            connection = HikariConnect.getConnect();//Hikari建立数据库连接
            statement = connection.createStatement();//建立执行对象
            //search data
            String searchSql = "select * from mytest.message";
            resultSet = searchAll(statement, resultSet, searchSql);
            while (resultSet.next())
                System.out.println(resultSet.getObject("id")+"--"+ resultSet.getObject("command"));
            //insert data
            String insertSql = "INSERT INTO mytest.message (command,description,content) VALUES ('吃饭1','打豆豆','睡觉')";
            int result = update(statement, insertSql);

            String updateSql = "update mytest.message set command='test',content='test' where id=4";
            int updateResult = update(statement, updateSql);

            String deleteSql = "delete from mytest.message where id=5";
            int deleteResult = update(statement, deleteSql);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //JDBCConnect.closeConnect(connection, statement, resultSet);
            HikariConnect.closeConnect(connection, statement, resultSet);

        }
    }


    public static ResultSet searchAll(Statement statement, ResultSet resultSet, String searchSql) throws SQLException {
        resultSet = statement.executeQuery(searchSql);
        return resultSet;
    }

    public static int update(Statement statement, String sql) throws SQLException {
        return statement.executeUpdate(sql);
    }
}
