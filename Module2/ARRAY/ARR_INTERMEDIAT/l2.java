//  copy an array by iterating the array
import java.util.*;

public class l2
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
    
        for(int i=0; i<arr.length; i++)
        {
            int  y = arr[i];
            System.out.print(y+" ");
        }
    }
}