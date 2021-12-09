package top.bearcad.java.basic.threaddemo;

import java.util.concurrent.TimeUnit;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-25 08:55
 **/
public class SleepDemo {
    //public static native void sleep(long millis) throws InterruptedException;

    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
