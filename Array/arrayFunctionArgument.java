//In Java, arrays always work like call by reference, so when we change their values inside a function, the changes also reflect in the main function.
package Array;

public class arrayFunctionArgument {
    public static void update(int num[]) {
        for (int i = 0; i < num.length; i++) {
            num[i] += 1;
        }
    }

    public static void main(String[] args) 
    {
        int num[] = { 21, 31, 41 };
        update(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}