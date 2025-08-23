package Question_Sheets;

import java.util.*;

public class Q60 {
    public static void leftRotationbyk(int arr[], int k ) {
        
         k = k % arr.length;  // in case k > arr.length
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60 };


        System.out.print("Enter the Ratated number of loop : ");
        int k =  sc.nextInt();
        leftRotationbyk(arr, k);
    }
}
