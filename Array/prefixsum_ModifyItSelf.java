package Array;
import java.util.*;
public class prefixsum_ModifyItSelf 
{
    public static int[] ModifyItSelf(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            arr[i]= arr[i-1] + arr[i];  
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = { 3, 7, 2, 8 };
        int result[] = ModifyItSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}
