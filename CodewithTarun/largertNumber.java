// Find the Second Larger Numbers in Array  :-

package CodewithTarun;

public class largertNumber {
    public static int findlerger(int arr[]) {
        int index = 0;
        int larger = Integer.MIN_VALUE; // - infinite kehte hai

        for (int i = 0; i < arr.length; i++) {
            if (larger < arr[i]) {
                larger = arr[i];
                index = i;
            }
        }
        System.out.println("index is : " + index);
        return larger;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 0, 6, 8 };

        int result = findlerger(arr);
        System.out.println(result);
    }
}
