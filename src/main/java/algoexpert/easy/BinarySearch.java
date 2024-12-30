package algoexpert.easy;

public class BinarySearch {



    public static int binarySearch(int[] array, int target) {

        for (int start = 0, end = array.length -1, window = array.length; start < array.length;) {
            int windowSize = (end + 1) - start;
            if(windowSize <= 2){
                if(array[end - 1] == target){
                    return end - 1;
                } else if (array[start + 1] == target) {
                    return start + 1;
                }
                return -1;
            }
            int mid = (windowSize /2) + start;
            if(array[mid] == target){
                return mid;
            } else if (array[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        return -1;
    }




}
