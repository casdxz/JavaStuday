package top.bearcad.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: java-basic
 * @description: 批处理示例1
 * @author: bearcad
 * @create: 2021-12-01 22:42
 **/
public class BatchSample1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test",
                    "root", "980529");
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.addBatch("insert into emp values (111,'熊殿下',18)");
            stmt.addBatch("insert into emp values (222,'熊臣子',19)");
            //执行批处理
            stmt.executeBatch();
            con.commit();
            con.close();
        }catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
