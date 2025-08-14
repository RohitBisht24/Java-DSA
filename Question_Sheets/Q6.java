package Question_Sheets;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        a = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        sc.close();
    }
}