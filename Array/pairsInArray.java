package Array;

public class pairsInArray {
    public static void pairArrays(int arr[]) {
        int TP = 0;
        ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + "  ");
                TP++;
            }
            System.out.println();
        }
        System.out.println("Total Pair is : " + TP);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        pairArrays(arr);
    }
}
