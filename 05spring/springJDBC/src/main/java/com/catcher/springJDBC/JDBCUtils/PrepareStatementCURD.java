package com.catcher.springJDBC.JDBCUtils;

import org.springframework.transaction.annotation.Transactional;

import java.sql.*;

public class PrepareStatementCURD {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //connection = JDBCConnect.getConnect();//jdbc建立数据库连接
            connection = HikariConnect.getConnect();//Hikari建立数据库连接
            connection = HikariConnect.getConnect();
            connection.setAutoCommit(false);//关闭自动提交，与commit配合使用
            //search data
            String searchSql = "select * from mytest.message";
            preparedStatement = connection.prepareStatement(searchSql);//建立执行对象
            resultSet = searchAll(preparedStatement, resultSet, searchSql);
            while (resultSet.next())
                System.out.println(resultSet.getObject("id")+"--"+ resultSet.getObject("command"));


            //insert data
            String insertSql = "INSERT INTO mytest.message (command,description,content) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(insertSql);//建立执行对象
            for(int i = 0; i < 100; i++){
                preparedStatement.setString(1, "吃饭" + i);
                preparedStatement.setString(2, "打豆豆" + i);
                preparedStatement.setString(3, "睡觉" + i);
                preparedStatement.addBatch();//添加到批处理任务中
            }
            int[] result = update(preparedStatement);

            //update data
            String updateSql = "update mytest.message set command='1',content='test1' where id=?";
            preparedStatement = connection.prepareStatement(updateSql);//建立执行对象
            for (int i = 1; i< 10; i++){
                preparedStatement.setInt(1, i);
                preparedStatement.addBatch();//添加到批处理任务中
            }
            int[] updateResult = update(preparedStatement);

            //delete data
            String deleteSql = "delete from mytest.message where id = ?";
            preparedStatement = connection.prepareStatement(deleteSql);//建立执行对象
            for (int i = 20; i < 30; i++){
                preparedStatement.setInt(1, i);
                preparedStatement.addBatch();//添加到批处理任务中
            }
            int[] deleteResult = update(preparedStatement);

            connection.commit();//手动提交
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //JDBCConnect.closeConnect(connection, preparedStatement, resultSet);
            HikariConnect.closeConnect(connection, preparedStatement, resultSet);
        }
    }


    public static ResultSet searchAll(PreparedStatement preparedStatement, ResultSet resultSet, String searchSql) throws SQLException {
        resultSet = preparedStatement.executeQuery(searchSql);
        return resultSet;
    }
    //批处理执行sql
    public static int[] update(PreparedStatement preparedStatement) throws SQLException {
//        return preparedStatement.executeUpdate();
        return preparedStatement.executeBatch();
    }
}
