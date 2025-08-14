package Continue_Statement;
public class Continue_example 
{
    public static void main(String[] args) 
    {
        int i;
        for(i = 1; i <= 5; i++)  
        {
            if( i == 4)
            {
                continue;
            }
            System.out.println(i);
        }  
    }
}
