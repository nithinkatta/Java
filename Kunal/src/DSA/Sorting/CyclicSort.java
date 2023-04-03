package DSA.Sorting;
import java.util.*;


// o(n) comparation 
// This method is useful only for the number from 1 to N 
// to sort we need to arrange values at the (value-1) index
public class CyclicSort
{
    public static void main(String[] args)
    {
        int arr[] = {4,5,3,2,1};
        
        sort(arr);
        
        System.out.print(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else
            i++;
        }
    }
}

