//  reverse an array of integer values
import java.util.*;

public class l4
{
    public static void main(String[] args)
    {
        Scanner dp = new Scanner(System.in);
        System.out.println("Number of element: ");
        int x = dp.nextInt();
        int arr[] = new int[x];
        int y = 0;
        for (int i=1; i<arr.length; i++)
        {
            System.out.println("Enter new Element: ");
            arr[i] = dp.nextInt();
        }
        System.out.println("Your Array is: "+Arrays.toString(arr));

       /* System.out.print("Revers Array in intiger: ");
        for(int i=x-1; i>=0; i--)
        {
            y = arr[i];
            System.out.print(y+" ");
        }*/
        
        
    }
}