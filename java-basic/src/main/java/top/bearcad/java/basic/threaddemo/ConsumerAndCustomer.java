package top.bearcad.java.basic.threaddemo;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 21:16
 **/
public class ConsumerAndCustomer {

    /*public static void main(String[] args) throws InterruptedException{
        MessageQueue queue = new MessageQueue(2);
        //三个生产者向队列里存值
        for(int i = 0; i < 3; i++){
            int id = i;
            new Thread(() ->{
                queue.put(new Message(id,"值" + id));
            },"生产者" + i).start();
        }

        Thread.sleep(1000);

        //一个消费者不停地从队列理取消
        new Thread(() -> {
            while (true){
                queue.take();
            }
        },"消费者").start();
    }

     */
}
