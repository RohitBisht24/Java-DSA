import java.util.Scanner;
public class add_GST 
{                
    public static void main(String[] args) 
    {
        float total, GST, pen, pencil, eraser;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Price of Pen : ");
        pen = sc.nextInt();
        System.out.print("Enter the Price of Pencil : ");
        pencil = sc.nextInt();
        System.out.println("Enter the Price of eraser : ");
        eraser = sc.nextInt();

        total = pen + pencil + eraser ;

        GST = total + (total * 18 / 100);
    
        System.out.println("Total Price is : "+total);
        System.out.println("Add on 18% GST in Price is : " +    GST);

        sc.close();
    }
}

