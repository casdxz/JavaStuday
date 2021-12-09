package top.bearcad.java.basic.io04;

import java.io.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 21:25
 **/
public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2){
            System.out.println("命令行参数输入有误，请检查");
            System.exit(1);
        }
        File file01 = new File(args[0]);
        File file02 = new File(args[1]);

        if (!file01.exists()){
            System.out.println("被复制的文件不存在");
            System.exit(1);
        }
        File file;
        InputStream inputStream = new FileInputStream(file01);
        File file1;
        OutputStream outputStream = new FileOutputStream(file02);
        if ((inputStream != null) && (outputStream != null)){
            int temp = 0;
            while ((temp = inputStream.read()) != (-1)){
                outputStream.write(temp);
            }
        }
        inputStream.close();
        outputStream.close();
    }
}
