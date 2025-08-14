package Decision_Statement.if_else_if;

public class Lartest_of_three 
{
    public static void main(String[] args) 
    {
        int A = 1, B = 3, C = 6;
        
        if(A >= B && A >= C)
        {
            System.out.println("A is Largest Number. ");
        }
        else if (B >= C)
        {
            System.out.println("B is Largest Number. ");
        }
        else 
        {
            System.out.println("C is Largest Number. ");
        }
    }    
}
