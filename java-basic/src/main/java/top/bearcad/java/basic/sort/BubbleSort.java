package top.bearcad.java.basic.sort;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-09-26 17:52
 **/
public class BubbleSort {
    /**
     * 冒泡排序的一种实现，没有任何优化
     *
     * @param a:数组
     * param n:排序趟数
     */
    public static void bubbleSort1(int[] a, int n){
        int i , j;
        //表示n次排序过程。
        for (i = 0; i < n; i++){
            //前面的数字大于后面的数字就交换。
            for (j = 1; j < n - i; j++){
                if (a[j - 1] > a[j]){
                    //交换a[j - 1]和a[j]
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,3,2,5,6,7,5,3,6,78,6,4,23};
        BubbleSort.bubbleSort1(arr,arr.length);
        for (int i : arr){
            System.out.print(i + ",");
        }
    }
}
