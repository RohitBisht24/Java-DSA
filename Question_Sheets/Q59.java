package Question_Sheets;

import java.util.*;

public class Q59 {
    // for arrray Left Rotation.
    public static void leftRotationBy1(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    // for arrray right Rotation.

    public static void rightRotationBy1(int arr[]) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };

        // System.out.print("Left Rotation : ");
        // leftRotationBy1(arr);
        System.out.print("Right Rotation : ");
        rightRotationBy1(arr);
    }
}

/*
 * linear Search
 * Birnay Searchf
 * larger array
 * smaller array
 * second larger array
 * third larger array
 * (revise)
 * 
 * 
 * (Pending)
 * complete prap
 * reverse array (2 methods)
 * pair in array
 * print subarray --> H.W. (maximum and Minimum sum of subarray)
 * maximim subarray sum
 * 
 * 
 */
