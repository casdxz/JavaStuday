package top.bearcad.address.config;

import top.bearcad.address.App;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: address
 * @description:
 * @author: bearcad
 * @create: 2021-10-12 01:23
 **/
public class AppConfig {
    public static String title = "JavaFx address";

    public static String img = "img/logo.png";

    public static int stageWidth= 810;

    public static int stageHeight = 540;

    public static boolean stageResizable = true;
    public static void init(){
        try{
            Properties properties = new Properties();
            InputStream in = App.class.getResourceAsStream("app.properties");
            properties.load(in);
            title = properties.getProperty("title");
            img = properties.getProperty("icon");
            stageWidth = Integer.parseInt(properties.getProperty("stage.width"));
            stageHeight = Integer.parseInt(properties.getProperty("stage.height"));
            stageResizable = Boolean.parseBoolean(properties.getProperty("stage.resizable"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
