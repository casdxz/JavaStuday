package top.bearcad.java.basic.mapex;

import org.junit.jupiter.api.Test;

import java.util.Properties;
import java.util.Set;

/**
* @program: java-basic
*
* @description:
*
* @author: bearcad
*
* @create: 2021-11-11 11:04
*
**/
class ProDemo1Test {
    @Test
    void name() {
        Properties properties = new Properties();
        properties.setProperty("host", "测试");
        properties.setProperty("port", "测试数据");

        Set<String> keySet = properties.stringPropertyNames();
        for (String key : keySet) {
            System.out.println(key + ":" + properties.getProperty(key));
        }
    }
}