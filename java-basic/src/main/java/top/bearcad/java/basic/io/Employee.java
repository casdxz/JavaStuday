package top.bearcad.java.basic.io;

import java.io.Serializable;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-18 10:41
 **/
public class Employee implements Serializable {


    private static final long serialVersionUID = 997071141770100796L;

    public String name;
    public String address;
    public Integer age;

    //public Employee(String name, String address, Integer age) {
    //    this.name = name;
    //    this.address = address;
    //    this.age = age;
    //}


    public void check(){
        System.out.println(name +"----" + address );
    }
}
