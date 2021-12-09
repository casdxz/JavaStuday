package top.bearcad.java.basic.threaddemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 11:21
 **/
public class Server implements Runnable{

    private ServerSocket serverSocket;

    public Server(int port){
        try {
            this.serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        try {
            System.out.println("服务器启动，开始监听8080端口：");
            while (true){
                //
                Socket socket = serverSocket.accept();
                SocketThread st = new SocketThread(socket);
                new Thread(st).start();
            }
        }catch (IOException ee){
            ee.printStackTrace();
        }
    }
}
