/* compute the average value of an array of integers except the largest and smallest 
values*/

public class A2 
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i=1; i<arr.length-1; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("sum of element is: "+sum);
    }
}