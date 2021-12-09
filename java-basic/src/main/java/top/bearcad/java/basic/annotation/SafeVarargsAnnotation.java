package top.bearcad.java.basic.annotation;

/**
 * @program: java-basic
 * @description: 使用一下record
 * @author: bearcad
 * @create: 2021-11-10 22:17
 **/
public class SafeVarargsAnnotation<S> {


    private S[] args;

    public SafeVarargsAnnotation(S... args) {
        this.args = args;
    }

    public void loopPrintArgs(S... args) {
        for (S arg : args) {
            System.out.println(arg);
        }
    }

    public final void printSelfArgs(S... args) {
        for (S arg : this.args) {
            System.out.println(arg);
        }
    }

    public static <T> void loopPrintInfo(T... infos) {
        for (T info : infos) {
            System.out.println(info);
        }
    }

}


