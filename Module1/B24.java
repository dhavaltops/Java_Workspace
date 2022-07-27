/*
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

*/

public class B24
{
    public static void main(String args[])
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5-i; j++)
            {
                System.out.print(" ");
            }

            int C = 1;
            for (int j = 1; j <= i; j++) 
            {
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (i - j) / j;                        // main logic
            }
            System.out.println();
        }
    }
}