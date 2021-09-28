package top.bearcad.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-28 22:44
 **/
@Slf4j
public class RelationOperatorDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        log.info("x == y = " + (x == y));
        log.info("x != y = " + (x != y));
        log.info("x > y = " + (x > y));
        log.info("x < y = " + (x < y));
        log.info("x >= y = " + (x >= y));
        log.info("x <= y = " + (x <= y));
    }
}
