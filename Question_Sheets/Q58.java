package Leetcode_Questions.Question_Sheets;

public class Q58 {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int temp[] = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            temp[j++] = arr[i];
            // j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
