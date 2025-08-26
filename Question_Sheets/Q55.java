package Question_Sheets;

public class Q55 {
    public static int findGreatestNum(int arr[]) {
        int index = 0;
        int greatest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (greatest < arr[i]) {
                greatest = arr[i];
                index = i;
            }
        }
        System.out.println("Greatest Number is : " + index);
        return greatest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 96, 69, 77, 145, 20 };

        int result = findGreatestNum(arr);
        System.out.println("Greatest Number is : " + result);
    }
}
