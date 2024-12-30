package algoexpert.easy;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {

        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
