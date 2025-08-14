import java.util.Scanner;
public class sum_natural_num
{
    public static void main(String[] args) 
    {
        int i = 1;
        int n; 
        int sum = 0;
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the range of natural number : ");
        n = sc.nextInt();
        
        while(i <= n)
        {
            sum += i;
            i++;
            sc.close();
        }
        System.out.println(sum);
    }
}