// Write a Method named isEven that accept an int arguement. The method should return true if the argument is ecen, or false otherwise. Also write a Program to test your method.

package Functions.Practice_Questions;

import java.util.*;

public class Q2 {
    public static boolean checkEvenOrOdd(int n) {

        boolean isCheck;

        if (n % 2 == 0) {
            isCheck = true;
        } else {
            isCheck = false;
        }
        return isCheck;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to check Even or Odd : ");
        n = sc.nextInt();

        boolean result = checkEvenOrOdd(n);
        if (result) {
            System.out.println(checkEvenOrOdd(n) + " = it's Even Number.");
        } else {
            System.out.println(checkEvenOrOdd(n) + " = it's Odd Number. ");
        }
        sc.close();
    }
}
