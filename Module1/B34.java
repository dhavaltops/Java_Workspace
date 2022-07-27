/*
Write a Java program that accepts two double variables and test if both strictly between 0 and 1 
and false otherwise. 
*/
import java.util.*;

public class B34
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd number:");
        double b = sc.nextDouble();

        if ((a>0 && a<1) && (b>0 && b<1))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}