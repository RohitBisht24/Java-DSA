package Question_Sheets;

public class Q57 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 1, 12, 14 };
        boolean issorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            // int issorted = true;
            if (arr[i] > arr[i + 1]) {
                issorted = false;
                break;
            }
        }
        if (issorted == true) {
            System.out.println("matter sorted hai bhai");
        } else {
            System.out.println("matter sorted na hai bhai.");
        }
    }
}
