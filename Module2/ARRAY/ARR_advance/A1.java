// find common element between two arrays

public class A1
{
    public static void main(String[] args)
    {
        int arr1[] = {1,2,3};
        int arr2[] = {4,2,5};
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println("Common Element is: "+arr1[j]);
                }
            }
        }
    }
}