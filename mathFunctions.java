import java.util.*;
public class mathFunctions {
    public static void main(String[] args) {
        // System.out.println(Math.min(2, 5));            // Math.min
        // System.out.println(Math.max(22, 75));          // Math.max
        // System.out.println((int) Math.floor(12.0));    //  
        // System.out.println((int) Math.ceil(12.1));
        // System.out.println((int) Math.pow(2, 3));
        // System.out.println(Math.sqrt(81));
        // System.out.println(Math.round(12.8));

        int a = -15, b = 25;
        System.out.println("Absolute value of a: " + Math.abs(a));
        System.out.println("Max of a & b: " + Math.max(a, b));
        System.out.println("Min of a & b: " + Math.min(a, b));
        System.out.println("Square root of b: " + Math.sqrt(b));
        System.out.println("a^2: " + Math.pow(a, 2));
        System.out.println("Random number (1-50): " + ((int)(Math.random() * 50) + 1));
    
    }
}


/* 
            //  absolute value
            int num = -21;
            System.out.print(Math.abs(num1));   21  // this function  always be return a positive


            //  maximum and minimum number
            int a = 12;
            int b = 21;
            System.out.println(Math.min(a, b));    //12  show minimum number
            System.out.println(Math.max(a, b));    // 21 show maximun number

           // power and Square root
           System.out.println(Math.pow(2, 3));    // 8   calculete power of number
           System.out.println(Math.sqrt(25));    // 5    calculate square root of number


            // Rounding Function
            System.out.println(Math.round(4.6));     // 5 is round figure
            System.out.println(math.round(4.4));     // 4 is round figure
            system.out.println(Math.ceil(4.1));      // 5.0  (Next higher integer) apposite  of floor function
            System.out.println(Math. floor(4.9));    // 4.0  (Next lower integer)  aposite of ceil funvtion


            // Math.random   function
            System.out.println("Random number (1-50): "+ ((int)(Math.random() * 50)+ 1));  //     always print random number under 1 to 50

 */

