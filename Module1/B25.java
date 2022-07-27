/*

LENGTH OF ANY INETER OR POSITIVE/NAGATIVE

*/


import java.util.Scanner;

public class B25
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your number:");
        String a = sc.nextLine();

        int count = a.length();
        System.out.println("length of Ineter is : "+count );            // for count numbers
        int i=Integer.parseInt(a);                                      // String to integer
        if ( i > 0  )
        {
            System.out.println("positive number is:" + a);  
        }
        else
        {
            System.out.println("Sorry, we cant approve this number");
        }

    }
}