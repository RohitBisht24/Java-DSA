package Ternary_Operator;
public class Ternary_Example
{
    public static void main(String[] args) 
    {
        int num = 8; 
        String type;
        
        type = ((num % 2) == 0) ? "even": "odd";
        System.out.println(type);
    }
}