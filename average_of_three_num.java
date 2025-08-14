import java.util.Scanner;

public class average_of_three_num
{
    public static void main(String[] args) 
    {
        int a, b, c, Sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        b = sc.nextInt();
        System.out.print("Enter the third Number : ");
        c = sc.nextInt();

        Sum = a + b + c / 3;

        System.out.println("Average is : " + Sum);
        sc.close();




    }
}