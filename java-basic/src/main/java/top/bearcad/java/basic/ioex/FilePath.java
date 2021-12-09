package top.bearcad.java.basic.ioex;

import java.io.File;

/**
 * @program: java-basic
 * @description: 绝对路径和相对路径
 * @author: bearcad
 * @create: 2021-11-17 15:10
 **/
public class FilePath {
    public static void main(String[] args) {
        // 桌⾯的hello.txt⽂件
        File f = new File("C:/Users/Bear/Desktop/File/hello.txt");
        System.out.println(f.getAbsolutePath());
        // 项⽬下的bbb.java⽂件
        File f2 = new File("bbb.java");
        System.out.println(f2.getAbsolutePath());
    }
}
