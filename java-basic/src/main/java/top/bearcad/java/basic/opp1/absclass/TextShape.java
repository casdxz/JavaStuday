package top.bearcad.java.basic.opp1.absclass;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 18:39
 **/
public class TextShape {
    public static void main(String[] args) {
        Shape shape = new Circle(3);
        shape.getArea();
        System.out.println(shape.area);
        System.out.println(shape.getArea());
        shape = new Rectangle(2,5);
        System.out.println(shape.getArea());
    }
}
