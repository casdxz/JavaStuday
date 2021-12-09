package top.bearcad.java.basic.io02;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-21 20:00
 **/
public class WhiteSprayPaint extends FourS{
    public WhiteSprayPaint(Car car) {
        super(car);
    }

    @Override
    public void skin() {
        super.skin();
        System.out.println("花1000块钱喷白色的漆");
    }
}
