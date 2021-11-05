package top.bearcad.java.basic.opp1.absclass;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 17:56
 **/
public abstract class TextAbsclass {
    public void text(){
        System.out.println("普通的抽象方法");
    }
    /**
     * 抽象方法
     */
    public abstract void run();
    //
    //public static void main(String[] args) {
    //    TextAbsclass ta = new TextAbsclass() {
    //        @Override
    //        public void run() {
    //
    //        }
    //    }
    //}
}
