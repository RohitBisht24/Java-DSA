package Decision_Statement.Switch_Statement;

import java.util.Scanner;
public class Calculater 
{
    public static void main(String[] args) 
    {
        int num1,  num2 ;
        char operator;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter you Calculate Symbol : ");
        operator = sc.next().charAt(0);
        System.out.print("Enter the Second Number : ");
        num2 = sc.nextInt();
        

        switch (operator)
        {
            case '+' : System.out.println(num1 + num2);
                                break;
            case '-' : System.out.println(num1 - num2);
                                break;
            case '*' : System.out.println(num1 * num2);
                                break;
            case '/' : System.out.println(num1 / num2);
                                break;
            default  : System.out.println("Worng Symbol.");                 
        }
        sc.close();
    }    
}
