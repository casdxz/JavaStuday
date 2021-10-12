package top.bearcad.java.basic.annotation;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-11 11:00
 **/
@Slf4j
public class MyFieldText {
    private static MyField annotation;
    /**
     * 使用自定义注解
     */
    @MyField(description = "学习之路", length = 12)
    private static MyField username;
    public static void main(String[] args){
        //获取类模板
        Class<MyFieldText> c = MyFieldText.class;
        //获取所有字段
        for(Field f : c.getDeclaredFields()){
            //判断这个字段是否有MyField注解
            if (f.isAnnotationPresent(MyField.class)){
                MyField annotation = f.getAnnotation(MyField.class);
                log.info("字段：{}， 描述：{}， 长度：{}", f.getName(), annotation.description(), annotation.length());
            }
        }
    }
}
