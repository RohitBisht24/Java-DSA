package Contol_Statement.For_Loop;

import java.util.Scanner;
public class one_to_n
{
    public static void main(String[] args) 
    {
        int i, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Range of tha Number : ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) 
        {
            System.out.println(i);
            sc.close();   
        }
    }
}