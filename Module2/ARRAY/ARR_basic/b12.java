import java.util.Arrays;
import java.util.Scanner;

public class b12
{
    public static void main(String[] args)
    {
        Scanner dp = new Scanner(System.in);
        System.out.println("Enter the total number of the elements:  ");
        int d = dp.nextInt(); 
        double arr[] = new double[d];
        double total = 0;
        for(int i=0; i<d; i++)
        {
            arr[i] = dp.nextInt();
            total += arr[i];
        }
        System.out.print("Array Element is :");
        System.out.println(Arrays.toString(arr));
        System.out.println("sUM OF ALL ARRAY ELEMENT IS: "+total);
    }   
}
