package algoexpert.easy;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {

        for (int sortedPointer = 0; sortedPointer < array.length; sortedPointer++) {
            int currentSmallestPointer = sortedPointer;
            for (int searchPointer = sortedPointer + 1; searchPointer < array.length; searchPointer++) {
                if(array[searchPointer] < array[currentSmallestPointer]){
                    currentSmallestPointer = searchPointer;
                }
            }
            int tmp = array[sortedPointer];
            array[sortedPointer] = array[currentSmallestPointer];
            array[currentSmallestPointer] = tmp;
        }
        return array;
    }
}
