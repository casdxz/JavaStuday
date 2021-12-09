package top.bearcad.java.basic.ioex;

import java.io.File;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-17 15:03
 **/
public class FileConstructor {
    public static void main(String[] args) {
        // ⽂件路径名
        String pathname = "C:/Users/Bear/Desktop/File/aaa.txt";
        File file1 = new File(pathname);
        System.out.println(file1);

        // 通过⽗路径和⼦路径字符串
        String parent = "C:/Users/Bear/Desktop/File/aaa";
        String child1 = "bbb.txt";
        File file2 = new File(parent, child1);
        System.out.println(file2);
        // 通过⽗级File对象和⼦路径字符串
        File parentDir = new File("C:/Users/Bear/Desktop/File/aaa");
        String child2 = "bbb.txt";
        File file3 = new File(parentDir, child2);
        System.out.println(file3);
    }
}
