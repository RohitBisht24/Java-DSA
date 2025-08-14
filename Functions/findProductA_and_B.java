package Functions;

public class findProductA_and_B 
{
    public static int Multiple(int a , int b)
    {
        int product = a * b;
        return product;
    }
    public static void main(String[] args)   
    {
        int a = 5;
        int b = 3;
        int product = Multiple(a , b);
        System.out.println("Product is : "+ product);
    }
}
