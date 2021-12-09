package top.bearcad.java.basic.threaddemo;

import java.io.*;
import java.net.Socket;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 23:41
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 2020);
        System.out.println("客户端启动");
        //上传
        //new Thread(()->{
        //    try {
        //        uploading(socket, "3.jpg");
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //
        //}).start();
        //下载
        new Thread(()->{
            try {
                download(socket, "4.jpg");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    //上传
    public static void uploading(Socket socket,String path) throws IOException {
        System.out.println("开始上传");
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(path);
        byte[] buff = new byte[1024*8];
        int length;
        while ((length=fis.read(buff)) != -1){
            os.write(buff,0,length);
        }
        System.out.println("上传成功!");
        fis.close();
        os.flush();
        os.close();
    }

    public static void download(Socket socket,String path) throws IOException {
        System.out.println("开始下载");
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(path);
        byte[] buff = new byte[1024*8];
        int length;
        while ((length = is.read(buff)) != -1){
            fos.write(buff,0,length);
        }
        System.out.println("下载成功");
        fos.flush();
        fos.close();
        is.close();
    }
}
