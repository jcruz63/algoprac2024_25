package algoexpert.easy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FindThreeLargestNumbersTest {

    @Test
    public void firstTest(){
        int[] numbers = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};

        assertArrayEquals(new int[]{18, 141, 541}, FindThreeLargestNumbers.findThreeLargestNumbers(numbers));
    }

    @Test
    public void allTheSame(){
        int[] numbers = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};

        assertArrayEquals(new int[]{7, 7, 7}, FindThreeLargestNumbers.findThreeLargestNumbers(numbers));
    }

    @Test
    public void allNegativeBut1(){
        int[] numbers = {-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7};

        assertArrayEquals(new int[]{-2, -1, 7}, FindThreeLargestNumbers.findThreeLargestNumbers(numbers));
    }
}
