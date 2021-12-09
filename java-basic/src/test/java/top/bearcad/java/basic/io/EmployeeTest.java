package top.bearcad.java.basic.io;

import org.junit.Test;

import java.io.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-18 10:46
 **/
public class EmployeeTest {

    @Test
    public void test() throws IOException{
        Employee employee = new Employee();
        employee.name = "张三";
        employee.address = "江苏";
        employee.age = 20;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.txt"));
        oos.writeObject(employee);
        oos.close();
        System.out.println("对象已被序列化保存");
    }
    @Test
    public void test1() throws IOException, ClassNotFoundException{
        File file;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.txt"));
        Employee employee = (Employee) ois.readObject();
        System.out.println(employee.name);
        System.out.println(employee.address);
        System.out.println(employee.age);
    }

}