package top.bearcad.java.basic.threaddemo;

/**
 * @program: java-basic
 * @description: 线程通信demo
 * @author: bearcad
 * @create: 2021-11-25 10:23
 **/
public class WaitNotifyDemo {
    /**
     * 对象锁
     */

    private static final Object lock = new Object();

    public static void main(String[] args) {
        new Thread(() ->{
            synchronized (lock){
                System.out.println("开始执行t1线程 ");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("继续执行t1其他代码");
            }
        },"t1").start();


        new Thread(() ->{
            synchronized (lock){
                System.out.println("开始执行t2线程 ");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("继续执行t2其他代码");
            }
        },"t2").start();

        //主线程代码
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //主线程唤醒
        System.out.println("开始唤醒");
        synchronized (lock){
            lock.notifyAll();
        }
    }
}
