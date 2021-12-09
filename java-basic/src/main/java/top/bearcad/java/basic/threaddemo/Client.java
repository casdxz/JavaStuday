package top.bearcad.java.basic.threaddemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 11:20
 **/
public class Client {
    private Socket socket;
    public Client(){
        try {
            this.socket = new Socket("localhost",8080);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Client(String host, int port){
        try {
            this.socket = new Socket(host,port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void sendMsg(String msg){
        try {
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(msg);
            writer.flush();
            System.out.println("客户端发送了消息"+msg);
            socket.shutdownOutput();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String temp;
            StringBuilder message = new StringBuilder();
            while ((temp = reader.readLine()) != null) {
                message.append(temp);
                System.out.println("Client: Get message from server :"+message );
            }
            writer.close();
            reader.close();
            socket.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
