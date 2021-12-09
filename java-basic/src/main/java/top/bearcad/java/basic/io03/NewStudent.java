package top.bearcad.java.basic.io03;

import lombok.Data;

/**
 * @program: java-basic
 * @description: 抽象装饰器
 * @author: bearcad
 * @create: 2021-11-21 20:14
 **/
@Data
public abstract class NewStudent implements Demo {
    //获取学生引用
    private Student student;

    public NewStudent(Student student) {
        this.student = student;
    }



    @Override
    public void code() {

        //本身就会的语言编程
        student.code();

        /*
        //在原有的基础上增加
        System.out.println("JavaScript");
        System.out.println("C++");
        System.out.println("C#");

         */
    }



}
