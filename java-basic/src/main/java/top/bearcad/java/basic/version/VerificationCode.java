package top.bearcad.java.basic.version;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @program: java-basic
 * @description: 生成二维码图片
 * @author: bearcad
 * @create: 2021-11-21 12:07
 **/
public class VerificationCode {

    /**
     * 验证码图片的长和宽
     */
    private int weight = 100;
    private int height = 40;

    /**
     * 用来保存验证码的文本内容
     */
    private String text;

    /**
     * 获取随机数对象
     */
    private Random r = new Random();


    /**
     * 画干扰线，验证码干扰线用来防止计算机解析图片
     * @param image
     */
    private void drawLine(BufferedImage image) {
        //定义干扰线的数量
        int num = r.nextInt(10);
        Graphics2D g = (Graphics2D) image.getGraphics();
        for (int i = 0; i < num; i++) {
            int x1 = r.nextInt(weight);
            int y1 = r.nextInt(height);
            int x2 = r.nextInt(weight);
            int y2 = r.nextInt(height);
            g.setColor(Tools.randomColor());
            g.drawLine(x1, y1, x2, y2);
        }
    }

    /**
     * 创建图片的方法
     * @return
     */
    private BufferedImage createImage() {
        //创建图片缓冲区
        BufferedImage image = new BufferedImage(weight, height, BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics2D g = (Graphics2D) image.getGraphics();
        //设置背景色随机
        g.setColor(new Color(255, 255, r.nextInt(245) + 10));
        g.fillRect(0, 0, weight, height);
        //返回一个图片
        return image;
    }

    /**
     *获取验证码图片的方法
     * @return
     */
    public BufferedImage getImage() {
        BufferedImage image = createImage();
        //获取画笔
        Graphics2D g = (Graphics2D) image.getGraphics();
        StringBuilder sb = new StringBuilder();
        //画四个字符即可
        for (int i = 0; i < 4; i++) {
            //随机生成字符，因为只有画字符串的方法，没有画字符的方法，所以需要将字符变成字符串 再画
            String s = Tools.randomChar() + "";
            //添加到StringBuilder里面
            sb.append(s);
            // 定义字符的x坐标
            float x = i * 1.0F * weight / 4;
            //设置字体，随机
            g.setFont(Tools.randomFont());
            //设置颜色，随机
            g.setColor(Tools.randomColor());
            g.drawString(s, x, height - 5);
        }
        this.text = sb.toString();
        drawLine(image);
        return image;
    }
    /**
     * 获取验证码文本的方法
     * @return
     */
    public String getText() {
        return text;
    }
}
