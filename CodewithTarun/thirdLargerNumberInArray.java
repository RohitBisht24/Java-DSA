package CodewithTarun;

public class thirdLargerNumberInArray {
    public static int searchthirdLarger(int arr[]) {
        int larger = Integer.MIN_VALUE;
        int SecondLarger = Integer.MIN_VALUE;
        int thirdLarger = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (larger < arr[i]) {
                thirdLarger = SecondLarger;
                SecondLarger = larger;
                larger = arr[i];
            } else if (arr[i] > SecondLarger && arr[i] != larger) {
                SecondLarger = arr[i];
            } else if (SecondLarger > thirdLarger && SecondLarger != thirdLarger) {
                thirdLarger = SecondLarger;
            }
        }
        return thirdLarger;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 5, 9, 12, 14 };

        System.out.println(searchthirdLarger(arr));
    }
}
