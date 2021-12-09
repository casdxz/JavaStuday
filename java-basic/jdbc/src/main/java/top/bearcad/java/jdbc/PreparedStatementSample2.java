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
 * @description: PreparedStatementSample2示例
 * @author: bearcad
 * @create: 2021-12-01 22:01
 **/
public class PreparedStatementSample2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test","root","980529");
            PreparedStatement ps = con.prepareStatement("INSERT INTO emp VALUES (?,?,?)");
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("enter id:");
                int id = Integer.parseInt(br.readLine());
                System.out.println("enter name:");
                String name = br.readLine();
                System.out.println("enter age:");
                int age = Integer.parseInt(br.readLine());

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setInt(3,age);
                int i = ps.executeUpdate();
                System.out.println(i + "行记录受影响");

                System.out.println("Do you want to continue:y/n");
                String s = br.readLine();
                if ("n".equals(s)) {
                    break;
                }
            }while (true);
            con.close();
        } catch (ClassNotFoundException | SQLException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
