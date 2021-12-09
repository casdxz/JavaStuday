package top.bearcad.java.basic.type;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-27 11:55
 **/
public class Demo {
    public static void main(String[] args) {

    }
}
class Emp{
    String name;
    int age;
    double salary;
    void print() {
        System.out.println("姓名 : " + name);
        System.out.println("年龄 : " + age);
        System.out.println("工资 : " + salary);
    }
}
class Test {
    public static void main (String[] args) {
        Emp e = new Emp();
        e.name = "bear";
        e.age = 20;
        e.salary = 5000.0;
        e.print();
    }
}
