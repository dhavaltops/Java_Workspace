/*
Ascii value of a given character.
*/

import java.util.Scanner;
public class B27
{

    public static void digit(char x)
    {
        int d =  x;
        System.out.println(d);
    }

    public static void main(String[] args)
    {
        char x;
      
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your input: ");
        x = sc.next().charAt(0);
        digit(x);
    } 
}