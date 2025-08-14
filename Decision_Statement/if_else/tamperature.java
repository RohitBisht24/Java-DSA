package Decision_Statement.if_else;
import java.util.Scanner;
public class tamperature
{
    public static void main(String[] args) 
    {
        int n ;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter you Fever tamperature : ");
        n = sc.nextInt();

        if(n >= 100)
        {
            System.out.print("you have a Fever. ");
        }
        else
        {
            System.out.print(" you don't have a fever. ");
        }
        sc.close();
    }
}