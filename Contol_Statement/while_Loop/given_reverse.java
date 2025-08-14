package Contol_Statement.while_Loop;

public class given_reverse {
    public static void main(String[] args) {
        int n = 29643;
        int rev = 0;
        int lastdigit;

        while (n > 0) {
            lastdigit = n % 10; // 4
            rev = (rev * 10) + lastdigit; // rev = (3 * 10) + 4 = 3
            n = n / 10; // 2964
        }
        System.out.println(rev);
    }
}
