package Array;

import java.util.Scanner;

public class linearSearchUserInput {
    public static boolean calculation(int arr[], int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index : " + i);
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the array : ");
        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];

        System.out.println("Enter " + arrSize + " elements :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Numebers : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key what to search : ");
        int key = sc.nextInt();

        boolean found = calculation(arr, key);

        if (found == false) {
            System.out.println("! Element Not found in the array.");
        }
        sc.close();
    }
}