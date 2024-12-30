package algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    public void testCase1(){
        int[] numbers = {8, 5, 2, 9, 5, 6, 3};
        assertArrayEquals(new int[]{2, 3, 5, 5, 6, 8, 9}, InsertionSort.insertionSort(numbers));
    }

}