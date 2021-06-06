package com.catcher.springJDBC.JDBCUtils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class HikariConnect {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;


    public static Connection getConnect() throws SQLException {
        HikariConfig hikariConfig = new HikariConfig();
        InputStream in = HikariConnect.class.getClassLoader().getResourceAsStream("hikari.properties");
        Properties properties = new Properties();
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("spring.datasource.driverClassName");
        url = properties.getProperty("spring.datasource.url");
        user = properties.getProperty("spring.datasource.username");
        password = properties.getProperty("spring.datasource.password");

        hikariConfig.setJdbcUrl(url);
        hikariConfig.setDriverClassName(driver);
        hikariConfig.setUsername(user);
        hikariConfig.setPassword(password);

        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        return dataSource.getConnection();
    }

    public static void closeConnect(Connection connection, Statement statement, ResultSet resultSet){
        try {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
            if (resultSet != null) resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
