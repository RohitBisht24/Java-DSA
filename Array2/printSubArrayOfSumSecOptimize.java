package Array2;

public class printSubArrayOfSumSecOptimize {
    public static void prefixArray(int arr[]) {
        int sum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // calculate prefix array
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // calculate sum of subarray
                sum = start == 0 ? arr[end] : arr[end] - arr[start - 1];
                System.out.println(sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        prefixArray(arr);
    }
}