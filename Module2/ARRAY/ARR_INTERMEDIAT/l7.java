//   find the duplicate values of an array of integer values
import java.util.*;

public class l7
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

        Arrays.sort(arr);
        for(int i=x-1; i>0; i--)
        {

            if(arr[x-1] > arr[i] )
            {
            System.out.println("Second largest element "+ arr[i]);
            break;
            }
            else
            {
                System.out.println("0");
            }        
        }
        System.out.println("Your Array is: "+Arrays.toString(arr));

    }
}

