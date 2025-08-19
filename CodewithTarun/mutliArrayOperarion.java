package CodewithTarun;

import java.util.*;

public class mutliArrayOperarion {
    public static int getInputKey(Scanner sc) {
        System.out.print("Enter the key Do you want a search : ");
        return sc.nextInt();
    }

    // Linear Search
    public static void linearSearch(int arr[], Scanner sc) {
        int key = getInputKey(sc);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found the key index is : " + i);
                return;
            }
        }
        System.out.println("key not Found!");
    }

    // Binary Search
    public static void binarySearch(int arr[], Scanner sc) {
        int key = getInputKey(sc);
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                System.out.println("found the key index is : " + mid);
                return;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Key not Found!");
    }

    // Larger Number
    public static void findLargerNum(int arr[]) {
        int larger = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (larger < arr[i]) {
                larger = arr[i];
            }
        }
        System.out.println("Larger Number is : " + larger);
    }

    // Smallest Number.
    public static void findSmallestNum(int arr[]) {
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.println("Smallest Number is : " + small);
    }

    // Second Larger Number.
    public static void secondLargerNum(int arr[]) {
        // int index;
        int firstLarger = Integer.MIN_VALUE;
        int secondLarger = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (firstLarger < arr[i]) {
                secondLarger = firstLarger;
                firstLarger = arr[i];
                // index = i;
            } else if (secondLarger < arr[i] && firstLarger != arr[i]) {
                secondLarger = arr[i];
            }
        }
        System.out.println("Second larger Element is : " + secondLarger);
    }

    // Third Larger Number.
    public static void thirdLargerNum(int arr[]) {
        // int index;
        int firstLarger = Integer.MIN_VALUE;
        int secondLarger = Integer.MIN_VALUE;
        int thirdLarger = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (firstLarger < arr[i]) {
                thirdLarger = secondLarger;
                secondLarger = firstLarger;
                firstLarger = arr[i];
                // index = i;
            } else if (secondLarger < arr[i] || firstLarger != arr[i]) {
                secondLarger = arr[i];
            } else if (thirdLarger < arr[i] || arr[i] < secondLarger) {
                thirdLarger = arr[i];
            }
        }
        System.out.println("Second larger Element is : " + thirdLarger);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("choose Operations : ");
        System.out.println("1. Binary Search. ");
        System.out.println("2. Linear Search. ");
        System.out.println("3. Largest Number. ");
        System.out.println("4. Smallest Number. ");
        System.out.println("5. Second Largest Number. ");
        System.out.println("6. third Largest Number. ");

        System.out.print("Enter the Number of Operation : ");
        int choice = sc.nextInt();

        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the " + n + " Elements :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value : ");
            arr[i] = sc.nextInt();
        }

        switch (choice) {
            case 1:
                binarySearch(arr, sc);
                break;
            case 2:
                linearSearch(arr, sc);
                break;
            case 3:
                findLargerNum(arr);
                break;
            case 4:
                findSmallestNum(arr);
                break;
            case 5:
                secondLargerNum(arr);
                break;
            case 6:
                thirdLargerNum(arr);
                break;
            default:
                System.out.println("Invalid Choice.");
        }
        sc.close();
    }
}
