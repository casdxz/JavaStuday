package top.bearcad.java.basic;

import top.bearcad.java.basic.array.ArrayDemo;

/**
 * @program: java-basic
 * @description:
 * @author: bear
 * @create: 2021-09-26 01:44
 **/
public class App {
    public static void main(String[] args) {
        System.out.println("app launch");
        int[] arr = {1,2,3,4,5};
        ArrayDemo ad = new ArrayDemo();
        int sum = ad.getSum(arr);
        System.out.println("sum = " + sum);
    }

}
