package top.bearcad.java.basic.version;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 12:16
 **/
public class Tools {
    /**
     * 字体数组
     */
    private final static String[] fontNames = {"宋体", "华文楷体", "黑体", "微软雅 黑", "楷体_GB2312"};
    /**
     * 验证码数组
     */
    private final static String codes = "123456789abcdefghjkmnopqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ";
    /**
     * 随机对象
     */
    private static Random random = new Random();
    /**
     * 生成随机颜色
     * @return 返回一个随机颜色
     */ public static Color randomColor() {
         //这里为什么是225，因为当r，g，b都为255时，即为白色，为了好辨认，需要颜色深一点。
        int r = random.nextInt(225);
        int g = random.nextInt(225);
        int b = random.nextInt(225);
        return new Color(r, g, b);
     }
     /**
      * 获取随机字体
      * @return 随机的字体
      */
     public static Font randomFont() {
         //获取随机的字体
         int index = random.nextInt(fontNames.length);
         String fontName = fontNames[index];
         //随机获取字体的样式，0是无样式，1是加粗，2是斜体，3是加粗加斜体
         int style = random.nextInt(4);
         //随机获取字体的大小
         int size = random.nextInt(10) + 24;
         return new Font(fontName, style, size);
     }
    /**
     * 获取随机字符
     * @return 随机字符
     */
    public static char randomChar() {
        int index = random.nextInt(codes.length());
        return codes.charAt(index);
    }

    public static void main(String[] args) {
        //定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
        //图形验证码写出，可以写出到文件，也可以写出到流
        lineCaptcha.write("../line.png");
        //输出code
        System.out.println(lineCaptcha.getCode());
        Scanner in = new Scanner(System.in);
        //验证图形验证码的有效性，返回boolean值,输入验证true代表一致
        boolean isTrue = lineCaptcha.verify(in.nextLine());
        System.out.println(isTrue);
    }
}
