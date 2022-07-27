import java.util.*;

public class B20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 5 numbers");
        int num, avg, sum = 0;
        for(int i=0; i<5; i++)
        {
            num =sc.nextInt();
            sum += num;
            
        }
        System.out.println("sum of 5 number is: "+sum);
        System.out.println("Average of 5 number is1: "+sum/5);

    }
}