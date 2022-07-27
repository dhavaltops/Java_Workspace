/*
Write a Java program to break an integer into a sequence of individual digits
*/
import java.util.*;

public class B35
{
    public static void main(String[] args) 
    {
        Scanner dp = new Scanner(System.in);
        System.out.print("Input six non-negative numbers:");
        String str = dp.nextLine();
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
        
    }   
}
