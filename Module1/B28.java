/*
EXAMPLE LIKE 

5
5 + 55 + 555
615

*/

import java.util.Scanner;
import java.lang.*;

public class B28
{
    public static void main(String[] args)
    {
        int s1,s2,s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any single digit number:");
        int n = sc.nextInt();
        
        System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);
        s1 = n;
        s2 = 11*n;
        s3 = 111*n;

        System.out.print(s1+s2+s3);
    }
}