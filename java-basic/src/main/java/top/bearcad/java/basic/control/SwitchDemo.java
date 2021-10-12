package top.bearcad.java.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-01 21:26
 **/
@Slf4j
public class SwitchDemo {
    public static void main(String[] args) {
        int i = 0 ;
        int j = -1;
        switch (i){
            case 0:
                j = 1;
            case 1:
                j = 1;
            case 2:
                j = 2;
        }
        log.info ("j = {}", j );
    }
}
