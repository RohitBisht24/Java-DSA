package Decision_Statement.Switch_Statement;
public class Weeks_Name 
{
    public static void main(String[] args) 
    {
        int days = 2 ;
        switch(days)
        {
            case 1: System.out.println("Monday");
                            break;
            case 2: System.out.println("Tuesday");
                            break;
            case 3: System.out.println("Wednesday");
                            break;
            case 4: System.out.println("thursday.");
                            break;
            case 5: System.out.println("friday.");
                            break;
            case 6: System.out.println("Saturday");
                            break;
            case 7: System.out.println("Sunday.");
                            break;
            default: System.out.println("Not a Valid day.");
        } 
    }    
}
