package algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {

    @Test
    public void isPalindrome(){
        String test = "abcdcba";
        assertTrue(PalindromeCheck.isPalindrome(test));
    }

}