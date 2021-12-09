package top.bearcad.java.jdbc;

import java.sql.*;

/**
 * @program: java-basic
 * @description: DatabaseMetaDataSample2
 * @author: bearcad
 * @create: 2021-12-01 22:22
 **/
public class DatabaseMetaDataSample2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test",
                    "root","980529");
            DatabaseMetaData dbmd = con.getMetaData();
            String[] table = {"VIEW"};
            ResultSet rs = dbmd.getTables(null,null,null,table);
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
