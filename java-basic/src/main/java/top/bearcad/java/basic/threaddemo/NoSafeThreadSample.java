package top.bearcad.java.basic.threaddemo;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 09:37
 **/
public class NoSafeThreadSample {
    private static int count = 0;

    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            for (int i = 0;i < 100;i++){
                count++;
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0;i < 100;i++){
                count--;
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count : " + count);
    }
}
