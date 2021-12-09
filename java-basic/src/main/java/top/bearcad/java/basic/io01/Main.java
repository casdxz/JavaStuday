package top.bearcad.java.basic.io01;

import java.io.*;

/**
 * @program: java-basic
 * @description: 测试类
 * @author: bearcad
 * @create: 2021-11-21 19:54
 **/
public class Main {
    public static void main(String[] args) {
        // 文件到文件
        try {
            InputStream is = new FileInputStream("abc.txt");
            OutputStream os = new FileOutputStream("abc-copy.txt");
            FileUtils.copy(is, os);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 文件到字节数组
        byte[] datas = null;
        try {
            InputStream is = new FileInputStream("0.jpg");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            FileUtils.copy(is, os);
            datas = os.toByteArray();
            System.out.println(datas.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(datas);
            OutputStream os = new FileOutputStream("src/1-copy.jpg");
            FileUtils.copy(is, os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
