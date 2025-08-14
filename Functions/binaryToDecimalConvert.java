package Functions;

import java.util.*;

public class binaryToDecimalConvert {
    public static double binToDec(int n) {
        int pow = 0; // pow = Power
        double dec = 0; // dec = Decimal
        int LD; // LD = Last Digit

        while (n > 0) { // n = 1
            LD = n % 10; // LD = 1
            dec = dec + (LD * Math.pow(2, pow)); // dec = 1 + (1 * 2 pow 2) = 1 + (4) = 5
            n = n / 10; // n = 0
            pow++; // pow = 4;
        }
        return dec;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary Number to convert Decimal : ");
        n = sc.nextInt();

        double result = binToDec(n);
        System.out.println("Decimal is : " + result);
        sc.close();
    }
}
