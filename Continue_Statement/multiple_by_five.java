package Continue_Statement;
import java.util.Scanner;

public class multiple_by_five 
{
    public static void main(String[] args) 
    {
        int n ;
        int i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number : ");
        n = sc.nextInt();

        do
        {
            if(n%5 ==0)
            {
                continue;
            }
            System.out.println(i);
            i++;
        }   while(i <= n);
        sc.close();
    }
}
