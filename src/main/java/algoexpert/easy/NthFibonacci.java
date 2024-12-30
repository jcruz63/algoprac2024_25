package algoexpert.easy;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacci {

    private static final Map<Integer, Integer> fibValueByPos = new HashMap<>(Map.of(1, 0, 2, 1));

    public static int nthFib(int left, int right,int currentPos, int targetPos){
        if(fibValueByPos.containsKey(targetPos)){
            return fibValueByPos.get(targetPos);
        }
        int val = left + right;
        fibValueByPos.putIfAbsent(currentPos, val);
        return nthFib(right, val, ++currentPos, targetPos);
    }

    public static int getNthFib(int n) {
        return nthFib(0, 1, 3, n);
    }
}
