package Functions;

import java.util.Scanner;
public class parameterCalculareSum
{
    public static int calculateSum(int a , int b) // Parameter of formal Parameters
    {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second Number : ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b); //Arguments or actual parameters
        System.out.println("Sum is : "+ sum);
        sc.close();
    }
}