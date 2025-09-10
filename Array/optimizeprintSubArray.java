package Array;

public class optimizeprintSubArray {
    public static void optimizeSubArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                System.out.println(sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        optimizeSubArray(arr);
    }
}
// Time Complexity: O(n^2)
