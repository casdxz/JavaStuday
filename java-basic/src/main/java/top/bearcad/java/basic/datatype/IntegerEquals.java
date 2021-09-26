package top.bearcad.java.basic.datatype;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-26 21:34
 **/
@Slf4j
public class IntegerEquals {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        log.info("a == b ? {}", a == b);

        Integer c = 127;
        Integer d = 127;
        log.info("c == d ? {}", c == d );

        Integer e = 127;
        Integer f = new Integer(127);
        log.info("e == f ? {}", e == f );

        Integer g = new Integer(127);
        Integer h = new Integer(127);
        log.info("g == h ? {}", g == h );

        Integer i = 128;
        int j = 128;
        log.info("i == j ? {}", i == j);

    }
}
