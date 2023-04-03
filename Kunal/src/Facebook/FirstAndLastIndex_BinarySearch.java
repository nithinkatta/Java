package Facebook;
import java.util.*;
public class FirstAndLastIndex_BinarySearch
{
    public static void main(String[] args)
    {
        int[] ans = {-1,-1};
        int arr[] = { 1,2,4,4,4,4,5,5,7,7};
        int tar = 4;
        
        int start = search(arr,tar,true);
        int end = search(arr,tar,false);
        ans[0] = start;
        ans[1] = end;
        System.out.print(Arrays.toString(ans));
    }
    
    static int search(int[] arr,int tar,boolean FindStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end)
        {
            int mid = (start + end)/2;
            
            if(tar < arr[mid])
                end = mid - 1;
            else if(tar > arr[mid])
                start = mid + 1;
            else{
                ans = mid;
                if(FindStartIndex)
                    end = mid - 1;
                else 
                    start = start + 1;
            }
        }
        return ans;
    }
}