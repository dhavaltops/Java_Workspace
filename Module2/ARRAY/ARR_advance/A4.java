//segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s
import java.util.Arrays;

public class A4
{
    public static void main(String[] args)
    {
        int arr[] ={0,1,0,1,1,0,1,1,0,0,1};
        Arrays.sort(arr);
        System.out.println("Modified array "+Arrays.toString(arr));
    }
}