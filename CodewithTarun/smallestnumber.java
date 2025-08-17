package CodewithTarun;

import java.util.Scanner;

public class smallestNumber {
    public static int findlerger(int arr[]) {
        int index = 0;
        int smallest = Integer.MAX_VALUE; // - infinite kehte hai

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
                index = i;
            }
        }
        System.out.println("index is : " + index);
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the " + n + " Elements :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Array Elements : ");
            arr[i] = sc.nextInt();
        }

        int result = findlerger(arr);
        System.out.println(result);
        sc.close();
    }
}
