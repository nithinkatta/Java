package DSA;
import java.util.*;
public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {1,24,55,100,233,666};
        //int tar = 0;
        
        Scanner in = new Scanner(System.in);
        int tar = in.nextInt();
        int i = search(arr,tar);
        if (i == 1)
            System.out.print("found");
        else
            System.out.print("Not found");
        
    }
    static int search(int[] arr, int tar)
    {
        int start = 0;
        int end = arr.length - 1 ;
        
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            
            if(tar > arr[mid])
                start = mid + 1;
            else if(tar < arr[mid])
                end = mid - 1;
            else 
                return 1;
        }
        return -1;
    }
}