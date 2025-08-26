package Question_Sheets;

public class Q56 {
    public static int findSecondLarger(int arr[]) {
        int index = 0;
        int larger = Integer.MIN_VALUE; // - infinite kehte hai
        int secondLarger = Integer.MIN_VALUE; // + infinite kehte hai

        for (int i = 0; i < arr.length; i++) {
            if (larger < arr[i]) {
                secondLarger = larger;
                larger = arr[i];
                index = i;
            } else if (arr[i] > secondLarger && arr[i] != larger) {
                secondLarger = arr[i];
            }
        }
        System.out.println("index is : " + index);
        return secondLarger;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 7, 5, 0, 9 };

        int result = findSecondLarger(arr);
        System.out.println(result);
    }
}
