package top.bearcad.java.basic.generics;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-06 00:20
 **/
public class GenericsInterfaceDemo01 implements Content<Integer>{
    private final int text;
    public GenericsInterfaceDemo01(int text) {
        this.text = text;
    }
    @Override
    public Integer text() { return text; }
    public static void main(String[] args) {
        GenericsInterfaceDemo01 demo = new GenericsInterfaceDemo01(10);
        System.out.print(demo.text());
    }
}
