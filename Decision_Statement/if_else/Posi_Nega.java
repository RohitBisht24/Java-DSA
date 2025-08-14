package Decision_Statement.if_else;
import java.util.Scanner; 
public class Posi_Nega 
{
    public static void main(String[] args) 
    {
        int n ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nNumber : ");
        n = sc.nextInt();

        if ( n >= 1)
        {
            System.out.print("Positive Number. ");
        }    
        else 
        {
            System.out.print("Nagetive Number. ");
        }
        sc.close();
    }    
}
