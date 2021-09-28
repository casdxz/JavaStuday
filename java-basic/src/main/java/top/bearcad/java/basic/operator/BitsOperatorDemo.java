package top.bearcad.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-28 22:44
 **/
@Slf4j
public class BitsOperatorDemo {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        log.info("a & b =" + c);

        c = a | b;
        log.info("a | b =" + c);

        c = a ^ b;
        log.info("a ^ b =" + c);

        c = ~a;
        log.info("~a = " + c);

        c = a << 2;
        log.info("a << 2 =" + c);

        c = a >> 2;
        log.info("a >> 2 =" + c);

        c = a >>> 2;
        log.info("a >>> 2 =" + c);
    }
}
