package top.bearcad.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-28 22:43
 **/
@Slf4j
public class LogiclOperatorDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        log.info("a && b = " + (a && b));
        log.info("a || b = " + (a || b));
        log.info("!(a && b) = " + !(a && b));
    }
}
