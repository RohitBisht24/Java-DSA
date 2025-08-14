import java.util.Scanner;

public class user_input_addition
{
    public static void main(String[] args) 
    {
        int num1, num2, Sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        num1 = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        num2 = sc.nextInt();

        Sum = num1 + num2;

        System.out.print("Sum is : " + Sum);
        sc.close();
    }
}