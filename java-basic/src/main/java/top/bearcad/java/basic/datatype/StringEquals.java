package top.bearcad.java.basic.datatype;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-26 21:48
 **/
@Slf4j
public class StringEquals {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        log.info("a == b ? {}", a == b);

        String c = "2";
        String d = "2";
        log.info("c == d ? {}", c == d);

        String e = new String("3").intern();
        String f = new String("3").intern();
        log.info("a == b ? {}", e == f);

        String g = new String("4");
        String h = new String("4");
        log.info("g == h ? {}", g.equals(h));
    }
}
