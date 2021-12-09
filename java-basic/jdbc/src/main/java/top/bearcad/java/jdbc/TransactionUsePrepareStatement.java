package top.bearcad.java.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program: java-basic
 * @description: 使用PreparedStatement接口实现事务
 * @author: bearcad
 * @create: 2021-12-01 22:36
 **/
public class TransactionUsePrepareStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test",
                    "root", "980529");
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("INSERT INTO emp VALUES (?,?,?)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("enter id :");
                String s1 = br.readLine();
                int id = Integer.parseInt(s1);

                System.out.println("enter name:");
                String name = br.readLine();

                System.out.println("enter age:");
                String s3 = br.readLine();
                int age = Integer.parseInt(s3);

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setInt(3,age);
                ps.executeUpdate();
                System.out.println("commit/rollback");
                String answer = br.readLine();
                if ("commit".equals(answer)) {
                    con.commit();
                }if ("rollback".equals(answer)){
                    con.rollback();
                }
                System.out.println("Want to add more record y/n");
                String ans = br.readLine();
                if ("n".equals(ans)) {
                    break;
                }
            }
            con.commit();
            System.out.println("operate finished!!");
            con.close();
        }catch (ClassNotFoundException | SQLException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
