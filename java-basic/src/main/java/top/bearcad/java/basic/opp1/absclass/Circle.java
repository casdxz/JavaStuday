package top.bearcad.java.basic.opp1.absclass;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 18:30
 **/
public class Circle extends Shape{

    public Circle() {
    }

    public Circle(double z) {
        super(z);
    }

    @Override
    public double getArea() {
        double resout = Math.PI * this.z * this.z;
        super.area = resout;
        return resout;
    }
}
