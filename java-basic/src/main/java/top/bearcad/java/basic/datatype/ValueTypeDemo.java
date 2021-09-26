package top.bearcad.java.basic.datatype;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-26 17:12
 **/
@Slf4j
public class ValueTypeDemo {
    public static void demo1() {
        //compile error
        //int num = 9999999999999999999999999999999;
    }
    public static void demo02(){
        //浮点型
        float f = 30.3f;
        //强制类型转换
        int x = (int) f;
        log.info("x = {}", x);
        //执行强制转换
        log.info("10 / 3 = {}", ((float) 10 / 3 ));
    }
    public static void demo03(){
        int max = Integer.MAX_VALUE;
        log.info("整型的最大值: {}", max);
        log.info("整型的最大值 + 1: {}", (max + 1));
        log.info("整型的最大值 + 2: {}", (max + 2));
        log.info("整型的最大值 + 2: {}", ((long) max + 2));
    }
    public static void demo04(){
        //字符是使用“‘”包括起来的数据
        char ch1 = 'a';
        //通过数字定义字符变量
        char ch2 = 97;
        log.info("ch1 = {}", ch1 );
        log.info("ch2 = {}", ch2 );
    }
    public static void demo05(){
        //表示的是一的“
        char ch1 = '\'';
        //表示的是一的\
        char ch2 = '\\';
        log.info("ch1 = {}", ch1 );
        log.info("ch2 = {}", ch2 );
        log.info("\"Hello World!\"");
    }
    public static void demo06(){
        //定义一个浮点型变量
        float num = 3.0f;
        log.info("两个小数相乘: {}", num * num);
    }
    public static void demo07(){
        //定义布尔型变量
        boolean flag = true;
        //打印输出
        log.info("flag = {}", flag);
    }
    public static void demo08(){
        //定义整形变量
        int x = 30;
        //第一浮点型变量
        float y = 22.19f;
        log.info("x / y  = {}", (x / y));
        log.info("10 / 3.5  = {}", (10 / 3.5));
        log.info("10 / 3  = {}", (10 / 3));
    }
    public static void demo09(){
        //定义字符串变量
        String str = "Super Man";
        int x = 30;
        //修改str的内容并将内容重新给str变量
        str = str + x;
        log.info("str = {}", str);
    }public static void demo10(){
        //定义整形变量
        int i = 1;
        //定义整形变量
        int j = 2;
        log.info("i + 2  = {}", i + 2);
        log.info("j + 2  = {}", (j + 2));
    }
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++){
            Method method = ValueTypeDemo.class.getMethod("demo" + 1);
            method.invoke(null);
        }
    }
}
