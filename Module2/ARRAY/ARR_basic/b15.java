// index element

import java.util.*;

public class b15
{
    public static void main(String[] args)
    {
        Scanner dp = new Scanner(System.in);
        System.out.println("Number of element: ");
        int x = dp.nextInt();
        int arr[] = new int[x];

        for(int i=0;  i<arr.length; i++)
        {
            System.out.println("Enter new element: ");
            arr[i] = dp.nextInt();
        }
        System.out.println("Your Array is: "+Arrays.toString(arr));

        System.out.println("Enter your element: ");
        int y = dp.nextInt();

        for(int i=0;  i<arr.length; i++)
        {
            if(y == arr[i])
            {
                System.out.println("Index value of  is: "+i);
                break;
            }

        }

    }
} 