package Contol_Statement.while_Loop;

public class Reverse_num {
    public static void main(String[] args) {
        int n = 10011;
        int lastdigit;

        while (n > 0) {
            lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
    }
}
