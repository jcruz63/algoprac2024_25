package algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthFibonacciTest {

    @Test
    public void getFirstPos(){
        assertEquals(0, NthFibonacci.getNthFib(1));
    }

    @Test
    public void getSecondPos(){
        assertEquals(1, NthFibonacci.getNthFib(2));
    }

    @Test
    public void getThirdPos(){
        assertEquals(1, NthFibonacci.getNthFib(3));
    }
    @Test
    public void getFourthPos(){
        assertEquals(2, NthFibonacci.getNthFib(4));
    }

    @Test
    public void get6thPos(){
        assertEquals(5, NthFibonacci.getNthFib(6));
    }

}