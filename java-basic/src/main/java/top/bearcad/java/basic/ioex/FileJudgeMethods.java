package top.bearcad.java.basic.ioex;

import java.io.File;

/**
 * @program: java-basic
 * @description: File类的判断⽅法
 * @author: bearcad
 * @create: 2021-11-17 15:12
 **/
public class FileJudgeMethods {
    public static void main(String[] args) {
        File f = new File("C:/Users/Bear/Desktop/File/bbb.java");
        File f2 = new File("C:/Users/Bear/Desktop/File/aaa");
        // 判断是否存在
        System.out.println("C:/Users/Bear/Desktop/File/bbb.java 是否存在:" + f.exists());
        System.out.println("C:/Users/Bear/Desktop/File/aaa 是否存在" + f2.exists());
        // 判断是⽂件还是⽬录
        System.out.println("C:/Users/Bear/Desktop/File/aaa 是⽂件?:" +
                f2.isFile());
        System.out.println("C:/Users/Bear/Desktop/File/aaa 是⽬录?:" +
                f2.isDirectory());
    }
}
