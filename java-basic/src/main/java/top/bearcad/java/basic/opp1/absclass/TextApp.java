package top.bearcad.java.basic.opp1.absclass;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 18:11
 **/
public class TextApp {
    public static void main(String[] args) {
        //多态
        TextAbsclass ta = new Text01();
        ta. run() ;
        ta = new Text02();
        ta.run();

    }
}
