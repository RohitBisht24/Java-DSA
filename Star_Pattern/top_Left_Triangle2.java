package Star_Pattern;

public class top_Left_Triangle2 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i - j) <= 0) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
