package top.bearcad.java.basic.opp1.absclass;

import top.bearcad.java.basic.opp1.text.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 20:01
 **/
public class TextEmployee {
    public static void main(String[] args) {
        Employee employee = new JavaEE();
        employee.setId("1001");
        employee.setName("Cat");
        System.out.println(employee);
        employee.work();
        System.out.println("**********************************");
        employee = new Android();
        employee.setId("1002");
        employee.setName("Bear");
        System.out.println(employee);
        employee.work();
        System.out.println("**********************************");
        employee = new NetWork();
        employee.setId("1003");
        employee.setName("Pig");
        System.out.println(employee);
        employee.work();
        System.out.println("**********************************");
        employee = new HardWare();
        employee.setId("1004");
        employee.setName("Panda");
        System.out.println(employee);
        employee.work();
    }
}
