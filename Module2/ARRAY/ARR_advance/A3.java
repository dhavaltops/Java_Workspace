/*check if the sum of all the 10's in the array is exactly 30. Return false if the 
condition does not satisfy, otherwise true*/

public class A3
{
    public static void main(String[] args)
    {
        int sum =0;
        int arr[] ={0,1,0,1,1,0,1,1,0,0,1};
        for(int i = 0; i < arr.length; i++ )
        {
            sum = sum + arr[i];
        }
         if(sum == 30)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
    }
}