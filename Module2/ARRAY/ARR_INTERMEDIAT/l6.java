//   find the duplicate values of an array of String values
import java.util.*;

public class l6
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"dhaval","zeel","dhaval","mihir"};
        for(int i=0; i<4; i++)
        {
            for(int j=i+1; j<4; j++)
            {
            if(arr[i] == arr[j])
            {
            System.out.println("Duplicate value is: "+ arr[j]);
            }
            }
        }
    }
}
