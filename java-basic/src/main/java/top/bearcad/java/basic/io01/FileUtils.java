package top.bearcad.java.basic.io01;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 19:53
 **/
public class FileUtils {
    public static void copy(InputStream is, OutputStream os) {
        try {
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(os, is);//后面会封装关闭方法
        }
    }
    /**
     * 释放资源
     *
     * @param ios
     */
    public static void close(Closeable... ios) {
        for (Closeable io : ios) {
            try {
                if (io != null) {
                    io.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
