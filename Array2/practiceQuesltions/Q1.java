package Array2.practiceQuesltions;
import java.util.*;
public class Q1 {
    public static boolean checkReteapNum(int num[]) {
        Arrays.sort(num);
        Set<Integer> repeats = new HashSet<>();
        boolean repeatNum = false;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) { // checking repeating numbers
                repeatNum = true;
                repeats.add(num[i]); // ignore repean numbers "java collection function"
            }
        }
        if (repeatNum) {
            System.out.print("Repeating Numbers : " + repeats + "\n");
        }
        return repeatNum;
    }

    public static void main(String[] args) {
        int num[] = { 0, 7, 5, 9, 6, 2, 4, 5, 9, 0, 0, 0 };
        // int num[] = { 6, 5, 7, 9, 2, 4, 1};
        System.out.println(checkReteapNum(num));
    }
}
