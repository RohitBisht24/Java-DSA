package Array2;

public class maxSubarraySum_PrefixArray {
    public static void prifixArray(int arr[]) {
        int sum = 0;
        int larger = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        // Calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // calculate sub array sum
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println(sum);

                if (larger < sum) {
                    larger = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Larger SubArray sum is : " + larger);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        prifixArray(arr);
    }
}
