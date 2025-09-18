package Array2;

public class maxSubarraySum_KadanesAlgo {
    public static void kadansAlgo(int arr[]) {
        int maxElement = Integer.MIN_VALUE; // track larger number element
        int larger = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            larger = Math.max(sum, larger);

            // for update maximum number update
            maxElement = Math.max(maxElement, arr[i]);
        }

        // if all array elements are zero
        if (larger == 0 && maxElement < 0) {
            System.out.println(maxElement); // larger nagetive number
        } else {
            System.out.println(larger); // normal Kadane result
        }
    }

    public static void main(String[] args) {
        // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int arr[] = { -5, -2, -8, -1, -9 };
        kadansAlgo(arr);
    }
}

// Time Complexity : O(n);

// Apply 2 conditions
// 1. agar sare koi sum 0 > negegive value to us number no ki negaitve ki jagah
// 0 kar do
// 2. if sare sum hi zero hai to usme se smallest number print karo


