package top.bearcad.java.jdbc;

import java.sql.*;

/**
 * @program: java-basic
 * @description: ResultSetMetaData接口示例
 * @author: bearcad
 * @create: 2021-12-01 22:12
 **/
public class ResultSetMetaDataSample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test",
                    "root", "980529");
            PreparedStatement ps = con.prepareStatement("select * from emp");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Total columns: " + rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
