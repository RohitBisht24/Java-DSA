import java.util.*;

public class Prime_Number {
    public static void main(String[] args) {
        int n;
        int i = 2;
        boolean isPrime;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to check Prime or Not : ");
        n = sc.nextInt();

        if (n == 2) {
            System.out.println(n + " is a Prime Number. ");
        } else {
            isPrime = true;
            while (i <= Math.sqrt(n)) // Math.sqrt(n) == (n-1)
            {
                if (n % i == 0) {
                    isPrime = false;
                }
                i++;
            }

            if (isPrime == true) {
                System.out.println(n + " is a Prime Number.");
            } else {
                System.out.println(n + " is not a Prime Number. ");
            }
        }
        sc.close();
    }
}