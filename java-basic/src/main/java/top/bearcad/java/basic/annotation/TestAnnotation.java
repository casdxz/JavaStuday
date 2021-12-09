package top.bearcad.java.basic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-10 21:18
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    //int id();

    //String msg();
    public int id() default -1;
    public String msg() default "Java工程师";
}
