package top.bearcad.java.basic.mapex;

import java.util.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-11 09:48
 **/
public class MapDemo {
    public static void main(String[] args) {
        Map<String,List<String>> map = new HashMap<>(8);
        map.put("水果",new ArrayList<>(Arrays.asList("apple","orange")));
        map.put("手机",new ArrayList<>(Arrays.asList("apple","oppo")));
        map.put("电脑",new ArrayList<>(Arrays.asList("apple","huawei")));
        //map.put("软件2126","金帅");
        //map.put("软件2126","Bear");

        map.remove("水果");
        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.get("1"));
        System.out.println(map.containsKey("哈哈"));
        Set<Map.Entry<String, List<String>>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, List<String>>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

    }
}
