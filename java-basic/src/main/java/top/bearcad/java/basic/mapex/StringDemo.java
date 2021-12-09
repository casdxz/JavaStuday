package top.bearcad.java.basic.mapex;

import java.util.*;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-14 06:58
 **/
public class StringDemo {
    public static void main(String[] args) {

        //1.使用Scanner获取用户输入的字符串
        Scanner scan  = new Scanner(System.in);
        String s = scan.nextLine();

        //2.创建Map集合，key是字符串中的字符，value是字符个数
        HashMap<Character, Integer> map = new HashMap<>(8);
        for(char c : s.toCharArray()) {
            //判断map中是否有此键，
            if(map.containsKey(c)) {
                //有则说明已经出现过，给原有的值加1并存储
                map.put(c, map.get(c)+1);
            }
            else {
                //没有则说明第一次出现，存储为1
                map.put(c, 1);
            }
        }
        //3.遍历得出每个字符串出现的次数
        for(Map.Entry <Character, Integer> m:map.entrySet()) {
            Character c = m.getKey();
            Integer i = m.getValue();
            //运行输出
            System.out.println(c + "出现的次数为：" + i);
        }
    }
}
