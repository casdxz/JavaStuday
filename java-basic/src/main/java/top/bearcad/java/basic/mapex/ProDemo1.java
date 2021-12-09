package top.bearcad.java.basic.mapex;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-11 10:43
 **/
public class ProDemo1 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        InputStream in = ProDemo1.class.getResourceAsStream("/config/database.properties");
        prop.load(in);
        System.out.println(prop.getProperty("dbUrl"));
        System.out.println(prop.getProperty("databaseName"));



        //Properties properties = new Properties();
        //properties.setProperty("host","localhost");
        //properties.setProperty("port","3306");
        //properties.setProperty("username","root");
        //properties.setProperty("password","980529");
        //System.out.println(properties);
        //
        ////获取key对应值
        //String port = properties.getProperty("port111");
        //System.out.println(port);
        
        //所有的键存储Set集合
        //Set<String> keySet = properties.stringPropertyNames();
        //for (String key : keySet){
        //    System.out.println(key + ":" + properties.getProperty(key));
        //}
    }
}
