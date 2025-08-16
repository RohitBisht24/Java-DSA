// Binany search  applies only shoted arrays.
package Array;

public class binarySearch {
    public static int performSearching(int arr[], int key) {
        int start = arr[0];
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == key) { // key found
                return mid;
            } else if (arr[mid] < key) { // --->
                start = mid + 1;
            } else { // <---
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = -91;

        int result = performSearching(arr, key);
        if (result == -1) {
            System.out.println(key + " is Invaild key.");
        } else {
            System.out.println("index for key is : " + result);

        }
    }
}
