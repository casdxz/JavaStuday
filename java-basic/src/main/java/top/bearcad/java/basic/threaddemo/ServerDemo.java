package top.bearcad.java.basic.threaddemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 23:41
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2020);
        System.out.println("服务器启动成功!");
        while (true){
            Socket accept = serverSocket.accept();
            //用户上传
            //    uploading(accept);
            //用户下载图片3.jpg
            download(accept, "3.jpg");
        }
    }

    //用户上传
    public static void uploading(Socket accept){
        new Thread(()->{
            String path = System.currentTimeMillis()+".jpg";  //用当前时间来作为上传图片的名字
            InputStream is = null;
            FileOutputStream fos = null;
            try {
                is = accept.getInputStream();
                fos = new FileOutputStream(path);
                byte[] buff = new byte[1024*8];
                int length;
                while ((length=is.read(buff)) != -1){
                    fos.write(buff,0,length);
                }
                fos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fos.close();
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    //用户下载
    public static void download(Socket accept,String path){
        new Thread(()->{
            FileInputStream fis = null;
            OutputStream os = null;
            try {
                fis = new FileInputStream(path);
                os = accept.getOutputStream();
                byte[] buff = new byte[1024*8];
                int length;
                while ((length=fis.read(buff)) != -1){
                    os.write(buff,0,length);
                }
                os.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    os.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
