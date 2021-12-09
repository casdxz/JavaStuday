package top.bearcad.java.basic.io02;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 19:59
 **/
public class RedSprayPaint extends FourS{
    public RedSprayPaint(Car car) {
        super(car);
    }

    @Override
    public void skin() {
        super.skin();
        System.out.println("花2000块钱喷红色的漆");
    }
}
