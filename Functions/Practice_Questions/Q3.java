//Write a Java Program to check if a number is a Palindrome is Java ?

package Functions.Practice_Questions;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;
        int LD, n;
        int rev = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entee the Number to check Palindrome : ");
        n = sc.nextInt();

        int temp = n;

        while (n > 0) {
            LD = n % 10;
            rev = (rev * 10) + LD;
            sum += LD;
            fact *= LD;
            n = n / 10;

        }
        System.out.println("Total sum is : " + sum);
        System.out.println("Total factorial is : " + fact);

        if (rev == temp) {
            System.out.println("is Palindrome Number.");
        } else {
            System.out.println("is Not a Palindrome Number");
        }
        sc.close();
    }
}
