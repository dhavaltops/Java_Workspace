//   find the duplicate values of an array of integer values
import java.util.*;

public class l5
{
    public static void main(String[] args)
    {
        Scanner dp = new Scanner(System.in);
        System.out.println("Number of element: ");
        int x = dp.nextInt();
        int arr[] = new int[x];
        for (int i=0; i<arr.length; i++)
        {
            System.out.println("Enter new Element: ");
            arr[i] = dp.nextInt();
        }
        System.out.println("Your Array is: "+Arrays.toString(arr));

       
        for(int i=0; i<x-1; i++)
        {
            for(int j=i+1; j<x; j++)
            {
            if(arr[i] == arr[j])
            System.out.println("Duplicate value is: "+ arr[j]);
            }
        }

    }
}
