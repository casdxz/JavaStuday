package top.bearcad.java.basic.reflection;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 20:33
 **/
@Slf4j
public class ReflectDemo3 {
    public static void main (String[] args) throws NoSuchMethodException, InvocationTargetException,IllegalAccessException{
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        //list.add(28);//不是String，报错 ——> 下面通过反射解决这个问题

        Class<?> clazz = list.getClass();
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list,28);
        log.info("反射太强大了！{}", list);
    }
}
