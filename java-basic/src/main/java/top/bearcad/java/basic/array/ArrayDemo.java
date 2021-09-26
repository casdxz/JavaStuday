package top.bearcad.java.basic.array;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-26 16:36
 **/
public class ArrayDemo {
    /**
     * 求数组元素之和
     * @param array 整形形参数组
     * @return int : 元素之和
     */
    public int getSum(int[] array) {
        //
        int sum = 0;
        /*

         */
        for (int i = 0; i < array.length; i++) {
            sum += 1;
        }
        //
        return sum;
    }
}
