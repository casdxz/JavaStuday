package top.bearcad.java.basic.mapex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-14 06:56
 **/
public class Sample1 {
    public static void main(String[] args) {
        //List大集合
        List<List<String>> bigList = new ArrayList<>();

        //List小集合
        List<String> little1 = new ArrayList<>();
        List<String> little2 = new ArrayList<>();
        List<String> little3 = new ArrayList<>();

        //小集合存储字符串
        little1.add("张三");
        little1.add("李四");
        little1.add("王五");
        little2.add("赵六");
        little3.add("金帅");
        little3.add("Bear");

        //大集合，存储小集合
        bigList.add(little1);
        bigList.add(little2);
        bigList.add(little3);

        //遍历大集合
        Iterator<List<String>> iterator = bigList.iterator();
        while (iterator.hasNext()) {
            //取出大集合中的小集合
            List<String> little = iterator.next();
            Iterator<String> littleIterator = little.iterator();
            while (littleIterator.hasNext()) {
                System.out.println(littleIterator.next());
            }
        }
    }
}
