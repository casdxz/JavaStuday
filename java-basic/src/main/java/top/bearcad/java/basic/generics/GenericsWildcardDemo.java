package top.bearcad.java.basic.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-06 00:30
 **/
public class GenericsWildcardDemo {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = intList; // Error
        List<? extends Integer> intList2 = new ArrayList<>();
        List<? extends Number> numList2 = intList2; // OK
    }

}
