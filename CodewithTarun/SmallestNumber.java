package CodewithTarun;

import java.util.Scanner;

public class SmallestNumber {
    public static int findSmallest(int arr[]) {
        int index = 0;
        int smallest = Integer.MAX_VALUE; // +infinity jaisa value

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
                index = i;
            }
        }
        System.out.println("Index of smallest element is: " + index);
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = findSmallest(arr);
        System.out.println("Smallest element is: " + result);

        sc.close();
    }
}
