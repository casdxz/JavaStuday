package top.bearcad.java.jdbc;

import java.sql.*;

/**
* @program: java-basic
* @description: ResultSet接口示例
* @author: bearcad
* @create: 2021-11-30 19:05
**/
public class ResultSetSample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test", "root","980529");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
            //getting the record of 3rd row
            rs.absolute(1);
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            con.close();
        }catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
