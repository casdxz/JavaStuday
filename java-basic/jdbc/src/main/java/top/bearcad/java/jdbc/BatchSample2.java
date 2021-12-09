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
 * @description: 批处理示例2
 * @author: bearcad
 * @create: 2021-12-01 22:49
 **/
public class BatchSample2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test",
                    "root", "980529");
            PreparedStatement ps = con.prepareStatement("INSERT INTO emp VALUES (?,?,?) ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                System.out.println("enter id:");
                String s1 = br.readLine();
                int id = Integer.parseInt(s1);
                System.out.println("enter name:");
                String name = br.readLine();
                System.out.println("enter age:");
                String s3 = br.readLine();
                int age = Integer.parseInt(s3);
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, age);
                ps.addBatch();
                System.out.println("Want to add more records y/n");
                String ans = br.readLine();
                if ("n".equals(ans)){
                    break;
                }
            }
            ps.executeBatch();
            System.out.println("record successfully saved");
            con.close();
        }catch (ClassNotFoundException | SQLException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
