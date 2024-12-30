package algoexpert.easy;

import java.util.List;

public class ProductSum {

    public static int calcProductSum(Object obj, int lvl){
        if(obj instanceof Integer){
            return (Integer) obj ;
        }
        int currentSum = 0;
        if(obj instanceof List<?>){
            for (int i = 0; i < ((List) obj).size(); i++) {
                currentSum += calcProductSum(((List<?>) obj).get(i), lvl + 1);
            }
        }
        return currentSum * lvl;

    }

    public static int productSum(List<Object> array) {
        // Write your code here.
        int sum = 0;
        for (Object o : array) {
            sum += calcProductSum(o, 2);
        }
        return sum;
    }
}
