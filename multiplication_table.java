import java.util.Scanner;
public class multiplication_table 
{
    public static void PrintMultiplicationTable(int Number)
    {
        int n , i;
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the Number : ");
        n = sc.nextInt();
        sc.close();

        for(i =1; i<=10; i++)
        {
            System.out.println(n + " * " + i + " = "+ n*i);
        }
        
    }
    public static void main(String s[])
    {
        PrintMultiplicationTable(5);
    }
    
}



