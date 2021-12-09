package top.bearcad.java.basic.annotation;

import java.lang.annotation.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-10 22:15
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface safeVarargs {
}
