/* Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined. 
*/

package CodewithTarun;

public class devideNumberDigits {
    public static void main(String[] args) {
        int n = 555;
        int LD;
        int orignal = n;
        int divide = 0;

        while (n > 0) {
            LD = n % 10;
            if (LD != 0 && orignal % LD == 0) {
                divide++;
            }

            n = n / 10;
        }
        System.out.println(divide);
    }
}
