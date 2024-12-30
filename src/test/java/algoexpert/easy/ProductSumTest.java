package algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductSumTest {

    @Test
    public void productShouldBe12(){
        List<Object> list = List.of(5, 2, List.of(7, -1), 3, List.of(6, List.of(-13, 8), 4));
        assertEquals(12, ProductSum.productSum(list));
    }
}