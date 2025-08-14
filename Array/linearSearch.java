package Array;

public class linearSearch {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 16;
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("key index is : " + i);
                break;
            }
        }
    }
}
