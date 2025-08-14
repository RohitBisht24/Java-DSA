package Break_Statement;
public class break_example 
{
    public static void main(String[] args) 
    {
         int i;

         for (i = 1; i <=5; i++)
         {
            if(i == 4)
            {
                break;
            }
            System.out.println(i);
         }
         System.out.println("i am out of loop.");
    }    
}
