package Functions;

import java.util.Scanner;
public class factorial_Of_N 
{
    public static int findFactorial(int n )
    {
        int fact = 1;
        int i = 1;

        while(i <= n)
        {
            fact = fact * i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) 
    {
        int n ; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for Factroial Number : ");
        n = sc.nextInt();
        
        int result = findFactorial(n);
        System.out.println("Factorial is : "+ result);
        sc.close();
    }
}

