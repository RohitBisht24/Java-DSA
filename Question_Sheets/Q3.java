package Question_Sheets;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        num1 = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("The Sum of " + num1 + " & " + num2 + " = " + sum);
        sc.close();
    }
}
