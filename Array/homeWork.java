// Find the Minimux and Maximun number in Subarrays sum.

package Array;

public class homeWork {
    public static void findSubarray(int arr[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                System.out.println("= " + currSum);
                if (max < currSum) {
                    max = currSum;

                }
                if (min > currSum) {
                    min = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Minimum Sum is : " + min);
        System.out.println("Maximum Sum is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        findSubarray(arr);
    }

}
