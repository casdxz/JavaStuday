package top.bearcad.java.jdbc;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 * @program: java-basic
 * @description: JdbcRowSet接口示例2
 * @author: bearcad
 * @create: 2021-12-01 22:58
 **/
public class JdbcRowSetSample2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/jdbc_test");
            rowSet.setUsername("root");
            rowSet.setPassword("980529");
            rowSet.setCommand("SELECT * FROM emp ");
            rowSet.execute();
            rowSet.addRowSetListener(new MyListener());
            while (rowSet.next()){
                System.out.print(" Id: " + rowSet.getInt(1));
                System.out.print(" Name: " + rowSet.getString(2));
                System.out.print(" Age: " + rowSet.getInt(3));
                System.out.println();
            }
        }catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
class MyListener implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("Cursor Moved...");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("Cursor Changed...");
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("RowSet Changed...");
    }
}
