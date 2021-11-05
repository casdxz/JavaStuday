package top.bearcad.java.basic.lesson;

import javax.swing.*;
import java.awt.*;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 10:53
 **/
public class FrameDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("第一个Swing窗体");
        f.setSize(600 , 400);
        f.setBackground(Color.CYAN);
        f.setLocation(100 , 200);
        JLabel jLabel = new JLabel("请输入内容");
        JTextField jTextField1 = new JTextField("          ");
        JTextField jTextField2 = new JTextField("          ");
        JButton jButton1 = new JButton("确定");
        JButton jButton2 = new JButton("取消");

        f.setLayout(new FlowLayout(FlowLayout.CENTER , 10 ,10));
        f.add(jTextField1);
        f.add(jTextField2);
        f.add(jLabel);
        f.add(jButton1);
        f.add(jButton2);
        f.setVisible(true);
    }
}
