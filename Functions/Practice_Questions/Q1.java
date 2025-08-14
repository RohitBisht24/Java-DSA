//Write a java method to computer the average of three numbers.

package Functions.Practice_Questions;

import java.util.*;

public class Q1 {
    public static int avgThree(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for Average of Three Numbers : ");
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        c = sc.nextInt();

        int result = avgThree(a, b, c);
        System.out.print("Average of Three Number is : " + result);
        sc.close();
    }
}
