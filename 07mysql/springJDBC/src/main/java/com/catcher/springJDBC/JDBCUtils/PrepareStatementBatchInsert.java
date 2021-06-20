package com.catcher.springJDBC.JDBCUtils;

import java.math.BigDecimal;
import java.sql.*;
import java.time.Instant;

public class PrepareStatementBatchInsert {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();//开始时间
        Long midTime = startTime;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCConnect.getConnect();//jdbc建立数据库连接
//            connection = HikariConnect.getConnect();//Hikari建立数据库连接
            connection.setAutoCommit(false);//关闭自动提交，与commit配合使用
            int[] result;
            //clear table
            String clearSql = "truncate table  mall.order_info";
            preparedStatement = connection.prepareStatement(clearSql);//建立执行对象
            preparedStatement.execute();
            //insert data
            String insertSql = "INSERT INTO mall.order_info" +
                    "(order_num, user_id, consignee, address, phone, pay_way, card_id, pay_amount, order_amount," +
                    " discount_amount, order_time, pay_time, delivery_time, receipt_time, status, remark)" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            preparedStatement = connection.prepareStatement(insertSql);//建立执行对象
            for(int i = 0; i < 100; i++){
                for (int j = 0; j < 10000; j++){
                    preparedStatement.setString(1, "ORDER" + i * j); //order_num
                    preparedStatement.setInt(2, i);
                    preparedStatement.setString(3, "发送" + i * j);
                    preparedStatement.setString(4, "地址" + i * j);
                    preparedStatement.setString(5, "18888888888");
                    preparedStatement.setString(6, (i * j % 4) + "" );
                    preparedStatement.setString(7, "卡号" + i);
                    preparedStatement.setBigDecimal(8, BigDecimal.ONE);
                    preparedStatement.setBigDecimal(9, BigDecimal.ZERO);
                    preparedStatement.setBigDecimal(10,BigDecimal.TEN );
                    preparedStatement.setTimestamp(11, Timestamp.from(Instant.now()));
                    preparedStatement.setTimestamp(12, Timestamp.from(Instant.now()));
                    preparedStatement.setTimestamp(13, Timestamp.from(Instant.now()));
                    preparedStatement.setTimestamp(14, Timestamp.from(Instant.now()));
                    preparedStatement.setString(15, i * j % 5 + "");
                    preparedStatement.setString(16, "test");
                    preparedStatement.addBatch();//添加到批处理任务中
                }
                result = update(preparedStatement);
                connection.commit();//手动提交
                System.out.println(i + ":" + (System.currentTimeMillis() - midTime) + "ms");
                midTime = System.currentTimeMillis();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCConnect.closeConnect(connection, preparedStatement, resultSet);
//            HikariConnect.closeConnect(connection, preparedStatement, resultSet);
            Long endTime = System.currentTimeMillis();
            System.out.println("total:" + (endTime - startTime) + "ms");//139290ms
        }
    }

    //批处理执行sql
    public static int[] update(PreparedStatement preparedStatement) throws SQLException {
//        return preparedStatement.executeUpdate();
        return preparedStatement.executeBatch();
    }
}
