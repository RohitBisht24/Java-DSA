import java.util.*;

public class GuessTheNumber {

    public static void number() {
        int low = 1;
        int high = 100;
        int guess = (int) Math.floor(low + high / 2);

        System.out.println(guess);
        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);

        // if (low > high) {
        // System.out.println("low is high");
        // return;
        // }
        if (ch == 'c') {
            System.out.println("khush ho ja ");
        } else if (ch == 'h') {
            high = guess - 1;

        } else if (ch == 'l') {
            low = guess + 1;
        } else {
            System.out.println("invelid");
        }
        number();
        sc.close();
    }

    public static void main(String[] args) {

        number();
    }
}