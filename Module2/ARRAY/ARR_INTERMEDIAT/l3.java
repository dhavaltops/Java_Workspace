// insert an element (specific position) into an array
import java.util.*;

public class l3
{
    public static void main(String[] args)
    {
        Scanner dp = new Scanner(System.in);
        System.out.println("Number of element: ");
        int x = dp.nextInt();
        int arr[] = new int[x];

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter new Element: ");
            arr[i] = dp.nextInt();
        }
        System.out.println("Your Array is: "+Arrays.toString(arr));

        System.out.println("Enter your position:");
        int a = dp.nextInt();
        
        System.out.println("Enter your Element: ");
        arr[a] = dp.nextInt();
          
        System.out.println("Your Array is: "+Arrays.toString(arr));

    }
}