package top.bearcad.java.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 * @program: java-basic
 * @description: JdbcRowSet接口示例1
 * @author: bearcad
 * @create: 2021-12-01 22:56
 **/
public class JdbcRowSetSample1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/jdbc_test");
            rowSet.setUsername("root");
            rowSet.setPassword("980529");
            rowSet.setCommand("SELECT * FROM emp ");
            rowSet.execute();
            while (rowSet.next()){
                System.out.println(" Id: " + rowSet.getInt(1));
                System.out.println(" Name: " + rowSet.getString(2));
                System.out.println(" Age: " + rowSet.getInt(3));
                System.out.println();
            }
        }catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
