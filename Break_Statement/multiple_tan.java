package Break_Statement;

import java.util.Scanner;
public class multiple_tan 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter the value : ");
            n = sc.nextInt();

            if(n % 10 == 0)
            {
                break;
            }
            System.out.println(n);
       
        }   while(true); 
        sc.close();   
    }    
}
