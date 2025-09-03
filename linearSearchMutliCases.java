//Write a Java program to perform linear search on an array. The program should find all occurrences of a given key, print their indexes, and display how many times the key appears in the array.

import java.util.*;

public class linearSearchMutliCases {
    public static int linearSearch(int arr[], int key) {

        int multiindex[] = new int[arr.length];
        int j = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                multiindex[j++] = i;
                count++;
            }
        }

        if (count == 0) {
            return -1; // key not found
        }

        // srif wahi index print karne ke liye jaha key mili hai.
        System.out.print("Key found at index(es): ");
        for (int i = 0; i < j; i++) {
            System.out.print(multiindex[i] + " ");
        }

        System.out.println("\nkey = " + key + " repeated total " + count + " times");
        return count; // Agar key milti hai toh count return karo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater then 0!");
            sc.close();
            return;
        }
        
        int arr[] = new int[n];
        
        System.out.println("Enter the " + n + " elements :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the key do you want to search : ");
        int key = sc.nextInt();
        
        int result = linearSearch(arr, key);
        
        if (result == -1) {
            System.out.println(key + " not found in the array.");
        }
        sc.close();
    }
}
