package top.bearcad.java.basic.variable;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-26 16:59
 **/
@Slf4j
public class VariableDemo {
    /**
     *
     */
    private static int staticVar = 1024;

    /**
     *
     */
    private String instanceVar = "hello";
    /**
     *
     */
    public void  method(){
        //
        int localVar = 666;
        log.info("localVar before: {}", localVar);
        localVar = 888;
        log.info("localVar after: {}", localVar);
    }
    /**
     *
     *
     */
    public static void main(String[] args) {
        //
        log.info("staticVar before: {}", staticVar);
        staticVar = 2048;
        log.info("staticVar after: {}", staticVar);
        //
        VariableDemo vd = new VariableDemo();
        log.info("staticVar before: {}", vd.instanceVar);
        staticVar = 2048;
        log.info("staticVar after: {}", vd.instanceVar);
        //
        vd.method();
    }
}
