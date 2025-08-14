//Write a program to take two input A and find the value of power B.

import java.util.*;

public class powerWithoutFucn {
    public static void main(String[] args) {
        int num = 3;
        int power = 3;
        int total = 1;
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        num = sc.nextInt();

        System.out.print("Enter the Power : ");
        power = sc.nextInt();

        while (i <= power) {
            total = total * num;
            i++;
        }
        System.out.println(total);
        sc.close();
    }
}
