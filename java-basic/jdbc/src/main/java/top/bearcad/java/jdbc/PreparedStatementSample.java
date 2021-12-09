package top.bearcad.java.jdbc;

import java.sql.*;

/**
 * @program: java-basic
 * @description: PreparedStatementSample示例
 * @author: bearcad
 * @create: 2021-11-30 19:35
 **/
public class PreparedStatementSample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test", "root","980529");
            PreparedStatement stmt1 = con.prepareStatement("INSERT INTO emp VALUES (?,?,?)");
            //新增
            stmt1.setInt(1,4);
            stmt1.setString(2,"ddd");
            stmt1.setInt(3,44);
            int n1 = stmt1.executeUpdate();
            System.out.println(n1 + "行记录修改成功");
            //修改
            PreparedStatement stmt2 = con.prepareStatement("UPDATE emp SET name = ? where id = ?");
            stmt2.setString(1,"bear");
            stmt2.setInt(2,4);
            int n2= stmt2.executeUpdate();
            System.out.println(n2 + "行记录修改成功");
            //删除
            PreparedStatement stmt3 = con.prepareStatement("delete from emp where id = ?");
            stmt3.setInt(1,4);
            int n3 = stmt3.executeUpdate();
            System.out.println(n3 + "行记录删除成功");
            //查询
            PreparedStatement stmt4 = con.prepareStatement("select * from emp");
            ResultSet rs = stmt4.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) +
                        "  " + rs.getString(3));
            }
            con.close();

        }catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
