package top.bearcad.java.basic.io03;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 20:12
 **/
public class Test {
    public static void main(String[] args) throws Exception  {
        System.out.println("*****本身就会的语言编程*****");
        Student student = new Student();
        student.code();
        System.out.println("*****在原有的基础上增加*****");
        NewStudent newStudent = new Language(student);
        newStudent.code();

    }
}
