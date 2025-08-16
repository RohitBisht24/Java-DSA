package Question_Sheets;

public class Q56 {
   public static int findlerger(int arr[]) {
        int index = 0;
        int larger = Integer.MIN_VALUE; // - infinite kehte hai
        int smaller = Integer.MIN_VALUE; // + infinite kehte hai

        for (int i = 0; i < arr.length; i++) {
            if (larger < arr[i]) {
                smaller = larger;
                larger = arr[i];
                index = i;
            } else if (arr[i] > smaller && arr[i] != larger) {
                smaller = arr[i];
            }
        }
        System.out.println("index is : " + index);
        return smaller;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 6, 7, 0, 7 };

        int result = findlerger(arr);
        System.out.println(result);
    }
}
