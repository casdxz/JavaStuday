package top.bearcad.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: java-basic
 * @description: Statement接口示例
 * @author: bearcad
 * @create: 2021-11-30 15:57
 **/
public class StatementSample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test", "root","980529");
            Statement stmt = con.createStatement();
            int res1 = stmt.executeUpdate("insert into emp values(3,'xxx',22)");
            System.out.println(res1 + "行记录插入成功");
            int res2 = stmt.executeUpdate("update emp set name='yyy',age= 3 where id=2");
            System.out.println(res2 + "行记录修改成功");
            int res3 = stmt.executeUpdate("DELETE FROM emp WHERE id = 3");
            System.out.println(res3 + "行记录删除成功");
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
