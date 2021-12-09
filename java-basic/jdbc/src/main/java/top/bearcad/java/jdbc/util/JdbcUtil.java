package top.bearcad.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: java-basic
 * @description: Jdbc工具类
 * @author: bearcad
 * @create: 2021-12-02 09:35
 **/
public class JdbcUtil {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "980529";


    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            //Statement stmt = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return conn;
    }
}
