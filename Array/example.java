package Array;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[20];

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        num[3] = sc.nextInt();

        System.out.print(num[0]);
        System.out.print(num[1]);
        System.out.print(num[2]);
        System.out.print(num[3]);
        sc.close();
    }
}