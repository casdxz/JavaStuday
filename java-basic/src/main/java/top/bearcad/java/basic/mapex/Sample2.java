package top.bearcad.java.basic.mapex;

import java.util.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-14 06:59
 **/
public class Sample2 {
    public static void main(String[] args) {
        //List大集合
        List<Map<String , String>> bigList = new ArrayList<>();
        //Map存储学生信息小集合
        Map<String , String> map1 = new HashMap<>(8);
        Map<String , String> map2 = new HashMap<>(8);

        //存储学生信息
        map1.put("001" , "张三");
        map1.put("002" , "李四");

        map2.put("001" , "王五");
        map2.put("002" , "赵六");
        map2.put("003" , "金帅");
        map2.put("004" , "Bear");

        //将map存储到List集合
        bigList.add(map1);
        bigList.add(map2);

        //遍历List集合——使用迭代器
        /**
         * 迭代器也就是将集合的数据放到一个容器中并排成一排，iterator有一个游标，最初的时候，游标在第一个元素前面，
         * 调用Iterator.next()是将游标往后移一位，Iterator.hasNext()是判断游标后面还没有可以迭代的元素。
         */
        Iterator<Map<String, String>> iterator = bigList.iterator();
        while (iterator.hasNext()) {
            Map<String, String> map = iterator.next();
            //遍历Map集合
            //entrySet() 方法可以用来遍历迭代 HashMap 中每一个映射项
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            //迭代器
            Iterator<Map.Entry<String, String>> iteratorSet = entrySet.iterator();
            while (iteratorSet.hasNext()) {
                Map.Entry<String, String> entry = iteratorSet.next();
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}
