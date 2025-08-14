import java.util.Scanner;
public class area_of_circle 
{
    public static void main(String[] args) 
    {
        float radius;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value : ");
        radius = sc.nextInt();

        float area = 3.14f * radius * radius;
        System.out.println(area);
        sc.close();
    }
}
