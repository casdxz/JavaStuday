package top.bearcad.java.basic.annotation;

import java.lang.annotation.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-10 20:54
 **/

@Retention(RetentionPolicy.RUNTIME)//
@Target(ElementType.TYPE)
@Inherited //
public @interface Desc {
    enum Color {
        White, Grayish, Yellow
    }
    // 默认颜色是白色的
    Color c() default Color.White;
}
