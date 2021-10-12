package top.bearcad.java.basic.array;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-04 20:37
 **/
@Slf4j
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        selectShort(arr);
    }
    public static void selectShort(int[] arr){
        for(int i = 0; i <arr.length-1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int j : arr){
            log.info(j + " ");
        }
    }
}
