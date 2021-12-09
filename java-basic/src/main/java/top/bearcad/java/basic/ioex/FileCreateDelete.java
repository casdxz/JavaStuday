package top.bearcad.java.basic.ioex;

import java.io.File;
import java.io.IOException;

/**
 * @program: java-basic
 * @description: File的创建和删除⽅法
 * @author: bearcad
 * @create: 2021-11-17 15:13
 **/
public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
        // ⽂件的创建
        File f = new File("aaa.txt");
        System.out.println("是否存在:" + f.exists());
        System.out.println("是否创建:" + f.createNewFile());
        System.out.println("是否存在:" + f.exists());
        // ⽬录的创建
        File f2 = new File("newDir");
        System.out.println("是否存在:" + f2.exists());
        System.out.println("是否创建:" + f2.mkdirs());
        System.out.println("是否存在:" + f2.exists());
        // ⽂件的删除
        System.out.println(f.delete());
        // ⽬录的删除
        System.out.println(f2.delete());
    }
}
