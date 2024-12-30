package algoexpert.easy;

import java.util.Arrays;

public class InsertionSort {
    
    public static int[] insertionSort(int[] array) {
        
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[j]>array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
