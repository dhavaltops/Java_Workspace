// find max of array

import java.util.*;

public class b16
{
    public static void main(String[] args)
    {
        Scanner dp = new Scanner(System.in);
        System.out.println("Numbers of Element: ");
        int x = dp.nextInt();
        int arr[] = new int[x]; 

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter new element: ");
            arr[i] = dp.nextInt();
        }
        System.out.println("your array is:"+Arrays.toString(arr));         // printn array

        // sort array
        Arrays.sort(arr);
        System.out.println("Maximum element of array is: "+arr[arr.length-1]);     // max array

       
    }
}