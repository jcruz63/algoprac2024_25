package algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void doesContain(){
        int[] numbers = {0, 1, 21, 33, 45, 45, 61, 71, 72,73};
        assertEquals(3, BinarySearch.binarySearch(numbers, 33));
    }

    @Test
    public void doesContain111(){
        int[] numbers = {1, 5, 23, 111};
        assertEquals(3, BinarySearch.binarySearch(numbers, 111));
    }

    @Test
    public void doesContain5(){
        int[] numbers = {1, 5, 23, 111};
        assertEquals(1, BinarySearch.binarySearch(numbers, 5));
    }

    @Test
    public void doesNotContain35(){
        int[] numbers = {1, 5, 23, 111};
        assertEquals(-1, BinarySearch.binarySearch(numbers, 35));
    }

    @Test
    public void doesContain0(){
        int[] numbers = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        assertEquals(0, BinarySearch.binarySearch(numbers, 0));
    }

    @Test
    public void doesContain61(){
        int[] numbers = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        assertEquals(6, BinarySearch.binarySearch(numbers, 61));
    }


    @Test
    public void doesNotContain(){
        int[] numbers = {0, 1, 21, 33, 45, 45, 61, 71, 72,73};
        assertEquals(-1, BinarySearch.binarySearch(numbers, 3));
    }
}