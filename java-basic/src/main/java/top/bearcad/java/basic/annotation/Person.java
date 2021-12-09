package top.bearcad.java.basic.annotation;

import java.lang.annotation.Repeatable;


/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-10 21:05
 **/
@Repeatable(Persons.class)
public @interface Person {
    String role() default "";
}
