package top.bearcad.java.basic.threaddemo;

import java.util.concurrent.TimeUnit;

/**
 * @program: java-basic
 * @description: join示例，join是指调用该方法线程进入阻塞状态，等待某线程执行完后恢复执行
 * @author: bearcad
 * @create: 2021-11-25 09:01
 **/
public class JoinDemo {
    private static int r ;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("t线程的优先级：" + Thread.currentThread().getPriority());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r = 10;
        });

        t.start();
        //让主线程阻塞，等待t线程执行完毕，在恢复执行
        t.join();

        System.out.println(Thread.currentThread().getPriority());
        System.out.println("r : " + r);
    }

}
