package top.bearcad.java.basic.opp1.absclass;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 18:35
 **/
public class Rectangle extends Shape {
    public Rectangle(double width, double height){
        super(width,height);
    }

    @Override
    public double getArea() {
        return this.x * this.y;
    }
}
