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
            } else if (arr[i] > SecondLarger && arr[i] < larger) {
                thirdLarger = SecondLarger;
                SecondLarger = arr[i];
            } else if (arr[i]>thirdLarger && arr[i] <SecondLarger) {
                thirdLarger = arr[i];
            }
        }
        return thirdLarger;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 5, 9, 12, 14 };

        System.out.println(searchthirdLarger(arr));
    }
}
