package Array;

import java.util.*;

public class prefixSum {
    public static int[] findPrefix(int arr[]) {

        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 7, 2, 8 };
        int result[] = findPrefix(arr);

        System.out.println(Arrays.toString(result));
    }
}


