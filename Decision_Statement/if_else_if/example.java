package Decision_Statement.if_else_if;

public class example
{
    public static void main(String[] args) 
    {
        int age = 10;
        
        if(age <= 12)
        {
            System.out.print("Child");
        }
        else if(age >= 13 && age <= 18 )
        {
            System.out.print("Teenager");
        }
        else
        {
            System.out.print("Adault");
        }
    }    
}
