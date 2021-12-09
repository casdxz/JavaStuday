package top.bearcad.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: java-basic
 * @description: 使用Statement接口实现事务
 * @author: bearcad
 * @create: 2021-12-01 22:29
 **/
public class TransactionUseStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test",
                    "root", "980529");
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into emp values (5,'eee',55)");
            stmt.executeUpdate("insert into emp values (6,'fff',66)");
            con.commit();
            con.close();
        }catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
