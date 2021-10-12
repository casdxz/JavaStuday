package top.bearcad.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-06 21:04
 **/
/**
 *Java反射之Class类的练习
 * 在面向对象的语言里，万事万物皆对象，那么类是谁的对象呢？
 * 类的类型是Class
 */
@Slf4j
public class ClassDemo {
    public static void main(String[] args) {
        //在Java API中提供了获取 Class 类对象的三种方法，

        //第一种，使用 Class。forName 静态方法。前提：已明确类的全部径名
        Class clazz1 = null;
        try {
            clazz1 = Class.forName("top.bearcad.java.basic.reflect.User");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        //第二种，使用 .class 方法。说明：仅适合在编译前就已经明确要操作的 Class
        Class clazz2 = User.class;

        //第三种，使用类对象的 getClass（） 方法。蛇和有对象实例的情况下
        User user = new User();
        Class clazz3 = user.getClass();

        //结果
        log.info("clazz1——clazz2——clazz3:{},{},{}",clazz1,clazz2,clazz3);
        log.info(String.valueOf(clazz1 == clazz2));
        log.info(String.valueOf(clazz3 == clazz2));
    }
}
