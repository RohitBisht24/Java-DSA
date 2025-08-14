package Star_Pattern;

public class bottom_Left_Triangle {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}