package Array;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("sum is : " + sum);
        sc.close();
    }
}