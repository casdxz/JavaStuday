package top.bearcad.java.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: java-basic
 * @description: DatabaseMetaData接口示例
 * @author: bearcad
 * @create: 2021-12-01 22:17
 **/
public class DatabaseMetaDataSample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test",
                    "root", "980529");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Driver Name :" + dbmd.getDriverName());
            System.out.println("Driver Version :" + dbmd.getDriverVersion());
            System.out.println("Username :" + dbmd.getUserName());
            System.out.println("Database Product Name :" + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version :" + dbmd.getDatabaseProductVersion());
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
