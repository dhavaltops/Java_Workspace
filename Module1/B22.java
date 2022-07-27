public class B22
{
    public static void main(String[] args)
    {
        int x;
        System.out.println(" print a patttern ");
        int count = 1;
        for(int i = 1; i<=5; i++)
        {
            for (int j = 1; j<=i; j++)
           
            {
            System.out.print(count+"  ");
            count += 1;
            }
            
            System.out.print("\n");
        }
    }
}