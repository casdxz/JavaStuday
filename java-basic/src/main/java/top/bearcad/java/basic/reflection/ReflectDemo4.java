package top.bearcad.java.basic.reflection;

import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 20:34
 **/
@Slf4j
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("top.bearcad.java.basic.reflection.Student");

        //
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            log.info("注解：{}", annotation);
        }

        //
        TableSu tableSu = clazz.getAnnotation(TableSu.class);
        String value = tableSu.value();
        log.info("注解的值：{}", value);

        //
        Field field = clazz.getDeclaredField("name");
        FieldSu annotation = field.getAnnotation(FieldSu.class);
        log.info("name:{}", annotation.columnName());
        log.info("type:{}", annotation.type());
        log.info("lenght:{}", annotation.length());

    }
}
