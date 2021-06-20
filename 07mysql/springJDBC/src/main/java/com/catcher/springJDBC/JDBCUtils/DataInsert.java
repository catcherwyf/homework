package com.catcher.springJDBC.JDBCUtils;

import java.math.BigDecimal;
import java.sql.*;
import java.time.Instant;

public class DataInsert {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        Long midTime = startTime;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
    try {
            connection = JDBCConnect.getConnect();//jdbc建立数据库连接
//            connection = HikariConnect.getConnect();//Hikari建立数据库连接
            String deleteSql = "truncate table mall.order_info";
            statement = connection.createStatement();//建立执行对象
            int deleteResult = update(statement, deleteSql);
            //insert data
            for(int i = 0; i < 100; i++){
                for (int j = 0; j < 10000; j++){
                    String insertSql = "INSERT INTO mall.order_info" +
                            "( order_num, user_id, consignee, address, phone, pay_way, card_id, pay_amount, order_amount, discount_amount,"
                            + " order_time, pay_time, delivery_time, receipt_time, status, remark)"
                            + "VALUES('ORDER" +i * j+ "', " +i * j+ ", '发送" +i * j+ "', '地址" +i * j+ "', '18888888888', '" +i * j+ "', '卡号" +i * j
                            + "', "+ BigDecimal.ONE+", "+ BigDecimal.ZERO +", "+ BigDecimal.TEN +","
                            + " '"+ Timestamp.from(Instant.now())+"', '"+ Timestamp.from(Instant.now())+"', '"+ Timestamp.from(Instant.now())
                            + "', '"+ Timestamp.from(Instant.now())+"', '" +i * j+ "', 'test')";
                    ;
                    int result = update(statement, insertSql);
                }
                System.out.println(i + ":" + (System.currentTimeMillis() - midTime) + "ms");
                midTime = System.currentTimeMillis();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCConnect.closeConnect(connection, statement, resultSet);
//            HikariConnect.closeConnect(connection, statement, resultSet);
            Long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime + "ms");//353622ms
        }
    }

    public static int update(Statement statement, String sql) throws SQLException {
        return statement.executeUpdate(sql);
    }
}
