import java.util.Scanner;
public class Area_of_square
{
    public static void main(String[] args) 
    {
        int side, area;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value for area of Square : ");
        side = sc.nextInt();

        area = side * side;

        System.out.println("Area of Square is : " +area);
        sc.close();
    }
}