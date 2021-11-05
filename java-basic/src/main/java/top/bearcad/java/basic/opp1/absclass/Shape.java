package top.bearcad.java.basic.opp1.absclass;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 18:22
 **/
public abstract class Shape {
    protected double x;
    protected double y;
    protected double z;
    protected double area;

    public void setX(double x) {
        x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Shape(double z) {
        this.z = z;
    }

    public Shape(){
    }

    /**
     * 求面积
     * @return double
     */
    public abstract double getArea();

    public void show(){
        System.out.println(this.area);
    }

}
