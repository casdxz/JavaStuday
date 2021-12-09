package top.bearcad.java.basic.io03;

/**
 * @program: java-basic
 * @description: 具体装饰器：增加语言
 * @author: bearcad
 * @create: 2021-11-21 22:12
 **/
public class Language extends NewStudent{
    public Language(Student student){
        super(student);
    }

    @Override
    public void code(){

        super.code();
        //在原有的基础上增加
        System.out.println("JavaScript");
        System.out.println("C++");
        System.out.println("C#");
    }
}
