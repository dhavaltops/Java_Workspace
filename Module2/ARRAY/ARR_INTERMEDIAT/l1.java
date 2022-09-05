//remove a specific element from an array 

import java.util.*;

public class l1
{
    public static void main(String[] args)
    {
    Scanner dp = new Scanner(System.in);
    int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    System.out.println("Your array is "+Arrays.toString(arr));

    System.out.print("Enter an Element that you want to remove: ");
    int y = dp.nextInt();

    for(int j=0;  j<arr.length; j++)
        {
            if(y == arr[j])
            for (int i = j; i < arr.length; i++ )
            {
                arr[i] = arr[i+1];
                break;
            }
        }
    System.out.println("NEW array is: "+Arrays.toString(arr));
    }
}