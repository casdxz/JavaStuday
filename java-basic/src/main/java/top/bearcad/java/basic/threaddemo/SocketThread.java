package top.bearcad.java.basic.threaddemo;

import java.io.*;
import java.net.Socket;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 11:21
 **/
public class SocketThread implements Runnable{
    private Socket socket;

    public SocketThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public  void run(){
        InputStream in;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            String tmp;
            StringBuilder info = new StringBuilder();
            while ((tmp = reader.readLine()) != null) {
                info.append(tmp);
                System.out.println("Server:   Get Message");
                System.out.println("Server:   Message: " + info + ".ip address" + socket.getInetAddress().getHostAddress());
            }
            writer.print("receive the message");
            writer.flush();
            socket.shutdownOutput();
            writer.close();
            reader.close();
            socket.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
