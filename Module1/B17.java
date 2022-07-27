import java.util.Scanner;

public class B17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your element");
        char a = sc.next().charAt(0);
        int d = a;

        if (a == 65 || a == 69 || a == 73 ||a == 79 || a == 85 || a == 97 || a == 101 || a == 105 || a == 111 || a == 117 )
        {
            System.out.println("your element is vowel");
        }        
        else if (a < 65 && a > 90 || a < 97 && a > 122)
        {
            System.out.println("please enter valid element");
        }
        else
        {
            System.out.println("your element is Consonant");
        }
    
    
    }
    
}