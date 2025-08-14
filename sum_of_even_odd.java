import java.util.Scanner;

public class sum_of_even_odd
{
    public static void main(String[] args)
    {
        int number, choice;
        int evenSum = 0;
        int oddSum = 0;
        Scanner  sc = new Scanner (System.in);

        do
        {
            System.out.print("Enter the Number : ");
            number = sc.nextInt();

            if(number %2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }

            System.out.print("Do You watnt to Continue? pass 1 for Yes or 0 for No : ");

            choice = sc.nextInt();
        }

        while(choice == 1);

            System.out.println("Sum of even Number : " + evenSum);
            System.out.println("Sum of Odd Number : " + oddSum);
            sc.close();
     }
}