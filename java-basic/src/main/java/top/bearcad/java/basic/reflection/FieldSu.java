package top.bearcad.java.basic.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: java-basic
 * @description: 属性注解
 * @author: bearcad
 * @create: 2021-11-09 20:33
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldSu {
    String columnName();

    String type();

    int length();
}
