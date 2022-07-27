public class B33
{
    public static void main(String args[])
    {
        int sum = 0 ;
        int num = 100, count;
        for (int i = 1; i <= num; i++) 
        {
            count = 0;
            for (int j = 2; j <= i / 2; j++) 
            {
                if (i % j == 0)     
                {
                    count++;
                    break;
                }
            }

            if (count == 0) 
            {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of first 100 prime number is: "+sum);

    }
}
    