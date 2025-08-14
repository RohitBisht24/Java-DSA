// package advance_star_pattern;

// import java.util.*;

// public class hollowRectanglePattern {
//     public static void main(String[] args) {
//         int n = 5;
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number to Print Starts : ");
//         n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//             sc.close();
//         }
//     }
// }

package advance_star_pattern;

import java.util.*;

public class hollowRectanglePattern {
    public static void main(String[] args) {

        int n;
        int i = 2;
        boolean isPrime;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to check Prime or Not : ");
        n = sc.nextInt();

        if (n == 2) {
            System.out.println("is Prime Number.");
        } else {
            isPrime = true;
            while (i <= Math.sqrt(n)) {
                if (n % 2 == 0) {
                    isPrime = false;
                }
                i++;
            }
            if (isPrime == true) {
                System.out.println("is Prime Number.");
            } else {
                System.out.println("is Not Prime Number.");
            }
        }
        sc.close();
    }
}
