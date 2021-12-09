package top.bearcad.java.basic.threaddemo;

/**
 * @program: java-basic
 * @description: 线程礼让
 * @author: bearcad
 * @create: 2021-11-25 08:33
 **/
public class YieldDemo {
    public static void main(String[] args) {

        Runnable r1 = () -> {
            int count = 0;
            while (count <= 20){
                System.out.println("------------1 > " + count++);
                //try {
                //    Thread.sleep(1000);
                //}catch (InterruptUtil e){
                //    e.printStackTrce();
                //}
                }

            };

        Runnable r2 = () -> {
            int count = 0;
            while (count <= 20){
                System.out.println("------------2 > " + count++);
                //try {
                //    Thread.sleep(1000);
                //}catch (InterruptUtil e){
                //    e.printStackTrce();
                //}
            }

        };


        Thread t1 = new Thread(r1,"t1");
        Thread t2 = new Thread(r2,"t2");
        t1.start();
        t2.start();
    }
}

