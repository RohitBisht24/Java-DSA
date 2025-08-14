import java.util.Scanner;

public class factorial_num
{
    public static void main(String[] args) 
    {
        int i, num ;
        int fact = 1;
        Scanner  sc =  new Scanner(System.in);

        System.out.print("Enter the any Positive Number : ");
        num = sc.nextInt();

        sc.close();

        for(i = 1 ; i<= num; i++)
        {
            fact *= i; /// fact = fact * i;
        }
        System.out.println("Factorial is : "+fact);
    }
}