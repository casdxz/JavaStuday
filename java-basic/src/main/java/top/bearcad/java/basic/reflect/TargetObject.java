package top.bearcad.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-07 22:25
 **/
@Slf4j
public class TargetObject {
    private final String value;

    public TargetObject(){
        this.value = "default";
    }
    public void publicMethod(String s){
        log.info("I love " + s);
    }
    private void privatMethod(){
        log.info("value is" + value);
    }
}
