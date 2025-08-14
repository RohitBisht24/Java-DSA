package Star_Pattern;

public class buttom_Right_Triangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { // this is a square star pattern
                if (i + j > n) { // but if (Row-column) >= 0 then only show left bottom star pattern.
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
