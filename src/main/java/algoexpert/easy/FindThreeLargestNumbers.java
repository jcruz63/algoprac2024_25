package algoexpert.easy;

public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {

        int[] largestNumbers = new int[3];

        for (int i = 0; i < array.length; i++) {
            if(i < 1){
                largestNumbers[2] = array[i];
            } else if (i < 2) {
                if(largestNumbers[2] > array[i]){
                    largestNumbers[1] = array[i];
                }else{
                    largestNumbers[1] = largestNumbers[2];
                    largestNumbers[2] = array[i];
                }
            } else if (i < 3) {
                if(array[i] > largestNumbers[1] && array[i] < largestNumbers[2]){
                    largestNumbers[0] = largestNumbers[1];
                    largestNumbers[1] = array[i];
                } else if (array[i] >= largestNumbers[1] && array[i] >= largestNumbers[2] ) {
                    largestNumbers[0] = largestNumbers[1];
                    largestNumbers[1] = largestNumbers[2];
                    largestNumbers[2] = array[i];
                }
                else  {
                    largestNumbers[0] = array[i];
                }
            }


            if(array[i] > largestNumbers[1] && array[i] < largestNumbers[2]){
                largestNumbers[0] = largestNumbers[1];
                largestNumbers[1] = array[i];
            } else if (array[i] >= largestNumbers[1] && array[i] >= largestNumbers[2] ) {
                largestNumbers[0] = largestNumbers[1];
                largestNumbers[1] = largestNumbers[2];
                largestNumbers[2] = array[i];
            }
            else if (array[i] < largestNumbers[1] && array[i] >= largestNumbers[0]) {
                largestNumbers[0] = array[i];
            }
        }

        return largestNumbers;
    }


}
