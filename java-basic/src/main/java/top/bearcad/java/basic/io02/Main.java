package top.bearcad.java.basic.io02;

import java.io.IOException;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 20:00
 **/
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("=============出厂颜色=============");
        Car corolla = new Corolla();
        corolla.skin();
        System.out.println("============换颜色==============");
        RedSprayPaint red = new RedSprayPaint(new WhiteSprayPaint(corolla));
        red.skin();
    }


}