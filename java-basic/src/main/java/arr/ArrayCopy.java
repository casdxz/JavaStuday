package arr;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-03 00:21
 **/
public class ArrayCopy {
    public static void main(String[] args) {
        // 定义原数组，长度为8
        int scores[] = new int[] { 100, 81, 68, 75, 91, 66, 75, 100 };
        // 定义目标数组
        int newScores[] = new int[] { 80, 82, 71, 92, 68, 71, 87, 88, 81, 79, 90, 77 };
        System.out.println("原数组中的内容如下：");
        // 遍历原数组
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
        System.out.println("\n目标数组中的内容如下：");
        // 遍历目标数组
        for (int j = 0; j < newScores.length; j++) {
            System.out.print(newScores[j] + "\t");
        }
        System.arraycopy(scores, 0, newScores, 2, 8);
        // 复制原数组中的一部分到目标数组中
        System.out.println("\n替换元素后的目标数组内容如下：");
        // 循环遍历替换后的数组
        for (int k = 0; k < newScores.length; k++) {
            System.out.print(newScores[k] + "\t");
        }
    }
}
