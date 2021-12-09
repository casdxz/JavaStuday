package top.bearcad.java.basic.threaddemo;

import java.util.Date;
import java.util.concurrent.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 10:46
 **/
public class TreadPoolDemo {
    public static void main(String[] args) {
        Runnable timeTask = () -> {
            while (true){
                System.out.println(new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello world";
            }
        };

        ExecutorService executorService = newFixedTreadPool(2);
        executorService.submit(timeTask);
        //executorService.execute(timeTask);

    }
    public static ExecutorService newFixedTreadPool(int threadCount){
        return new ThreadPoolExecutor(threadCount,threadCount,0L, TimeUnit.MICROSECONDS,
                new LinkedBlockingDeque<>());
    }

    public static ExecutorService newSingleTreadExecutor(){
        return new ThreadPoolExecutor(1,1,0L, TimeUnit.MICROSECONDS,
                new LinkedBlockingDeque<>());
    }

    public static ExecutorService newCachedTreadPool(){
        return new ThreadPoolExecutor(0,Integer.MAX_VALUE,60L, TimeUnit.SECONDS,
                new SynchronousQueue<>());
    }

    public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize){
        return  new ScheduledThreadPoolExecutor(corePoolSize);
    }

}
