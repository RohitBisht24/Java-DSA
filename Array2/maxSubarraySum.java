package Array2;

//Brute force method - 1.
public class maxSubarraySum {
    public static void maxiSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;

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
            }
            System.out.println();
        }
        System.out.println("Maximum Sum is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        maxiSum(arr);
    }

}
