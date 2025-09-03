package Question_Sheets;

import java.util.Arrays;

public class Q61 {
    public static void reverseArray(int arr[]) {
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr)); // A good way to print an array is to use the 'String method' rather
                                                  // than running a loop up to the length of the array.
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };

        reverseArray(arr);
    }
}
