// this is a Second Method to print bottom left triangle star pattern.
package Star_Pattern;

public class bottom_Left_Triangle2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { // this is a square star pattern
                if ((i - j) < 0) { // but if (Row-column) >= 0 then only show left bottom star pattern.
                    break;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
