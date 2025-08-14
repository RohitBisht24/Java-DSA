package Functions;
// Write a program to print all Prime numbers is the range form 1 to N.

import java.util.*;

public class primeNumInRange
{
    public static boolean isPrime(int n)
    {
        int i = 2;
        
        if (n == 2)
        {
            return true;
        }
        else
        {
            while(i <= Math.sqrt(n))
            {
                if (n % i == 0) 
                {
                    return false;     
                }
                i++;
            }
            return true;
        }
    }
    public static void primeRange(int n)
    {
        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the Number to N Range of Prime Numbers : ");
        n =  sc.nextInt();

        primeRange(n);
        sc.close();
    }
}