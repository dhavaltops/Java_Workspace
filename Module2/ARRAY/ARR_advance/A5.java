//cyclically rotate a given array clockwise by one.
import java.util.*;

public class A5
{
    public static void main(String args[])
    {
        
        int arr[] = {10,20,30,40,50,60};
        int n = arr.length;
        int count = arr[n-1];
        for(int i=n-1; i>0; i--)
        {
             arr[i] = arr[i-1];
        }
        arr[0] = count;
            System.out.println(Arrays.toString(arr));
    }
}