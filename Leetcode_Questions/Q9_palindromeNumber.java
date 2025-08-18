package Leetcode_Questions;

public class Q9_palindromeNumber 
{
    class Solution {
    public boolean isPalindrome(int x) {
        int lastDigit;
        int rev = 0;
        int original = x;

        while (x > 0) {
            lastDigit = x % 10;          // last digit nikal lo
            rev = (rev * 10) + lastDigit; // reverse banate jao
            x = x / 10;                  // last digit hata do
        }

        if (rev == original) {
            return true;
        } else {
            return false;
        }
    }
}

}
    
