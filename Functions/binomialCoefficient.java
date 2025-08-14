package Functions;

import java.util.Scanner;
public class binomialCoefficient 
{
    public static int factorial(int n)
    {
        int i = 1;
        int fact = 1;

        while(i <= n)
        {
            fact *= i;
            i++;
        }
        return fact;
    }
    public static int binCoeff(int n, int r)
    {
        int n_fact = factorial(n); // A
        int r_fact = factorial(r); // B
        int nmr_fact = factorial(n-r); // C

        int BC = n_fact / (r_fact * nmr_fact);
        return BC;
    }

    public static void main(String[] args)
    {
        int n, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input for Binomial of Ceofficient :-");

        System.out.print("First Number : ");
        n = sc.nextInt();

        System.out.print("Second Number : ");
        r = sc.nextInt();

        int result = binCoeff(n, r);
        System.out.println("Binomial Ceofficient is : "+result);
        sc.close();
    }
}
