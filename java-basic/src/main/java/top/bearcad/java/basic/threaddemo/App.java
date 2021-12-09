package top.bearcad.java.basic.threaddemo;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 11:35
 **/
public class App {
    public static void main(String[] args) {
        Server server = new Server(8080);
        new Thread(server).start();

        Client client1 = new Client();
        client1.sendMsg("hi,I'm client1");

        Client client2 = new Client();
        client2.sendMsg("hi,I'm client2");
    }
}
