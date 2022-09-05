//  To test if an array contains a specific value.

import java.util.*;

public class b14
{
    public static void main(String[] args)
    {
        Scanner dp =  new Scanner(System.in);
        System.out.println("number of elements: ");
        int x = dp.nextInt();
        int arr[] = new int[x];

        System.out.println("Enter any "+arr.length+" element:");
       
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = dp.nextInt();
        }

        System.out.println("Enter any element:");
        int value = dp.nextInt();
        
        for(int i=0; i<arr.length; i++)
        {
        if(value == arr[i])
        {
            System.out.println("It's exist in array ");
        }
        }
        //System.out.println(Arrays.toString(arr));        
        
    }
}