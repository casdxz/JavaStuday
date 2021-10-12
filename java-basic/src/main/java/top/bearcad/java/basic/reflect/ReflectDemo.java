package top.bearcad.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-07 22:29
 **/
@Slf4j
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException,
    NoSuchMethodException,IllegalAccessException,InstantiationException,
            InvocationTargetException,NoSuchFieldException {
        //
        Class<?> targetClass = Class.forName("top.bearcad.java.basic.reflect.TargetObject");
        //
        TargetObject targetObject = (TargetObject) targetClass.getDeclaredConstructor().newInstance();

        //
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods ){
            log.info("all methods:{}",method.getName());
        }
        //
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod",String.class);
        publicMethod.invoke(targetObject,"java");

        //
        Field field = targetClass.getDeclaredField("value");
        //
        field.setAccessible(true);
        field.set(targetObject,"javaStudy");

        //
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod ");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
