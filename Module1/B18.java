import java.util.*;

public class B18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your year");
        int a = sc.nextInt() ;
        
        if(a % 4==0 && a % 400 == 0 )
        {
            System.out.println("your year is  leap year");
        } 
        else if(a % 100 == 0) 
        {
            System.out.println("your year is not leap year");
        }
        
        
    }
}