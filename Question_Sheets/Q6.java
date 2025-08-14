package Question_Sheets;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        num1 = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num2 - num1;

        System.out.println("num1 = 10 swap to : " + num1);
        System.out.println("num2 = 20 swap to : " + num2);
        sc.close();
    }
}
