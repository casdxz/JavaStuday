package top.bearcad.java.basic.threaddemo;

import java.text.SimpleDateFormat;

import java.util.concurrent.*;
import java.util.Date;
/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 22:33
 **/
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) throws Exception {
        //test01();
        test02();
    }

    private static void test01() {
        ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();
        TimerTask timerTask = new TimerTask(2000);
        System.out.printf("起始时间：%s\n\n", new SimpleDateFormat("HH:mm:ss").format(new Date()));
        timer.scheduleAtFixedRate(timerTask, 1000, 3000, TimeUnit.MILLISECONDS);
    }

    private static void test02() {
        ScheduledExecutorService timer = Executors.newScheduledThreadPool(2);
        TimerTask timerTask = new TimerTask(3000);
        System.out.printf("起始时间：%s\n\n", new SimpleDateFormat("HH:mm:ss").format(new Date()));
        timer.scheduleAtFixedRate(timerTask, 1000, 3000, TimeUnit.MILLISECONDS);
    }

}
class TimerTask implements Runnable {

    private final int sleepTime;
    private final SimpleDateFormat dateFormat;

    public TimerTask(int sleepTime) {
        this.sleepTime = sleepTime;
        dateFormat = new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public void run() {
        System.out.println("任务开始，当前时间：" + dateFormat.format(new Date()));
        try {
            System.out.println("模拟任务运行");
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.err);
        }
        System.out.println("任务结束，当前时间" + dateFormat.format(new Date()));
        System.out.println();
    }
}



