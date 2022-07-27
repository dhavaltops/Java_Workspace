/*
Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
*/
import java.util.*;

public class B31
{
    public static void main(String aargs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int C = sc.nextInt();

         int y =  a + b ;
        
       // System.out.println("sum : "+ y);

        if ( y == C)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("sum of first two number is: "+y);
        }

    }
}