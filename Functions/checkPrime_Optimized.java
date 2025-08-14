package Functions;

import java.util.*;

public class checkPrime_Optimized {
    public static boolean isPrime(int n) {
        int i = 2;
        // boolean isPrime;

        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        } else {
            // isPrime = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to check Prime or not : ");
        n = sc.nextInt();

        System.out.println(isPrime(n));
        sc.close();

    }
}
