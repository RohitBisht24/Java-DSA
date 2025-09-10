package Array;

public class printSubarrays {

    public static void subArrays(int arr[]) {
        int n = arr.length;
        int subArrayCount = n * (n + 1)/2 ;  // for count total subarrays
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray : " + subArrayCount);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        subArrays(arr);
    }
}

// Time Complexity: O(n^3)