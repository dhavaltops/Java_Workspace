/*
CALCULATE STRING LENGTH
*/


import java.util.Scanner;

public class B26
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your input: ");
        String n = sc.nextLine();
        int stringlength = n.length();                           // main logic 
        System.out.println("String length:" + stringlength);
        
    }
}