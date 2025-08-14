package Functions;

import java.util.*;

public class decimalToBinaryConvert {
    public static int decToBin(int n) {
        int rem;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            rem = n % 2; // 0
            binNum = binNum + (rem * (int) Math.pow(10, pow)); // 0 + (0 * 10^1) = 0
            pow++;
            n = n / 2;
        }
        return binNum;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        n = sc.nextInt();

        int result = decToBin(n);
        System.out.println("Binary Number is : " + result);
        sc.close();
    }
}