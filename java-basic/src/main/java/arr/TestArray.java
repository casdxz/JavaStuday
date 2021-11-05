package arr;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-02 19:59
 **/
public class TestArray {


    /*
    public static void main(String[] args) {
        // 定义长度为8的数组
        int scores[] = new int[] { 57, 81, 68, 75, 91, 66, 75, 84 };
        System.out.println("原数组内容如下：");
        // 循环遍历原数组
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
        // 复制原数组的前5个元素到newScores数组中
        int newScores[] = (int[]) Arrays.copyOfRange(scores, 0, 5);
        System.out.println("\n复制的新数组内容如下：");
        // 循环遍历目标数组，即复制后的新数组
        for (int j = 0; j < newScores.length; j++) {
            System.out.print(newScores[j] + "\t");
        }
    }

     */


    /*
    public static void main(String[] args) {
        // 定义长度为 5 的数组
        int scores[] = new int[]{57,81,68,75,91};
        // 输出原数组
        System.out.println("原数组内容如下：");
        // 循环遍历原数组
        for(int i=0;i<scores.length;i++) {
            // 将数组元素输出
            System.out.print(scores[i]+"\t");
        }
        // 定义一个新的数组，将 scores 数组中的 5 个元素复制过来
        // 同时留 3 个内存空间供以后开发使用
        int[] newScores = (int[]) Arrays.copyOf(scores,8);
        System.out.println("\n复制的新数组内容如下：");
        // 循环遍历复制后的新数组
        for(int j=0;j<newScores.length;j++) {
            // 将新数组的元素输出
            System.out.print(newScores[j]+"\t");
        }
    }

     */




/*
    public static void main(String args[]) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        for (int i=0, n=array.length; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.fill(array, 111);
        for (int i=0, n=array.length; i< n; i++) {
            System.out.print(array[i] + " ");
        }
    }

 */



    ///**
    // * 使用递归的二分查找
    // * @description: recursionBinarySearch
    // * @param arr 有序数组
    // * @param key 待查找的关键字
    // * @return 找到的位置
    // */
    /*
    public static int recursionBinarySearch(int[] arr,int key,int low,int high){
        if (key < arr[low] || key > arr[high] || low > high){
            return -1;
        }
        //初始中间位置
        int middle = (low + high) / 2;
        if (arr[middle]>key){
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr,key,low,middle - 1);
        }else  if (arr[middle]<key){
            //比关键字大则关键字在右区域
            return recursionBinarySearch(arr,key,middle + 1 , high);
        }else{
            return middle;
        }
    }

     */

    ///**
    // * 不使用递归的二分查找
    // * @description: commonBinarySearch
    // * @param arr
    // * @param key
    // * @return 关键字位置
    // */
    /*
    public static int commonBinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;            //定义middle
        if (key < arr[low] || key > arr[high] || low > high){
            return -1;
        }
        while (low <= high){
            middle = (low + high) / 2;
            if (arr[middle]>key){
                //比关键字大则关键字在左区域
                high = middle - 1;
            }else  if (arr[middle]<key){
                //比关键字大则关键字在右区域
                low = middle + 1;
            }else{
                return middle;
            }
        }
        //最后仍没有找到，则返回-1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        while (true) {
            System.out.println("请输入需要查找的数字");
            int key = scan.nextInt();
            int[] arr = {1,3,5,7,9,11};
            int position = commonBinarySearch(arr, key);
            if (position == -1){
                System.out.println("查找的是" + key + "，序列中没有该数！");
            }else{
                System.out.println("查找的是" + key + "，找到位置为：" + position);
            }
        }

    }

     */



    /*
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {1,3,5,7};
        System.out.println(Arrays.equals(arr1, arr2));

        int[] arr3 = {2,4,6,8};
        int[] arr4 = {1,3,5,7};
        System.out.println(Arrays.equals(arr3, arr4));
    }


     */
   /*
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i <arr.length; i++){
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    */

    /*
    public static void main(String[] args) {
        // 数组大小
        int size = 10;
        // 定义数组
        double[] arr = new double[size];
        arr[0] = 5.1;
        arr[1] = 10.2;
        arr[2] = 15.3;
        arr[3] = 20.4;
        arr[4] = 25.5;
        arr[5] = 30.6;
        arr[6] = 35.7;
        arr[7] = 40.8;
        arr[8] = 45.9;
        arr[9] = 50;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }
        System.out.println("总和为： " + total);
    }
     */

    /*
    public static void main(String[] args) {
        double[] arr = {5.9, 12.9, 8.4, 3.5, 6.4, 34.2, 4.5};

        // 打印所有数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("总和是: " + total);
        // 查找最大元素
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值是: " + max);

        for (double element : arr) {
            System.out.println(element);
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

     */


}
