package Array;

public class lergestNumberArray {
    // for finding Largest number in array Elements
    public static int findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE; // - infinite -> most minimum number

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // for finding Smallest number in array elements
    public static int findsmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE; // + infinite -> most maximum number

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 65, 200, 7, 32, 7, 3 };

        System.out.println("Largest Number is : " + findLargest(arr));
        System.out.println("Smallest Number is : " + findsmallest(arr));
    }
}
