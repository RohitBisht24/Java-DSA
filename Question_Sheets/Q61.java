package Question_Sheets;

import java.util.Arrays;

public class Q61 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr)); // A good way to print an array is to use the 'String method' rather than
                                                // running a loop up to the length of the array.
    }
}
