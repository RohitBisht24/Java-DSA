package Question_Sheets;

import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        int sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter tha numbers : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum / n;
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + avg);
        sc.close();
    }
}
