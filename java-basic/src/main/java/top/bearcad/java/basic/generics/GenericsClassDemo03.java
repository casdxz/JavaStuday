package top.bearcad.java.basic.generics;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-06 00:17
 **/
public class GenericsClassDemo03 {
    public static void main(String[] args) {
        Info<String> info = new Info("Hello");
        MyMap<Integer, Info<String>> map = new MyMap<>(1, info);
        System.out.println(map);
    }
}
