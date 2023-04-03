package DSA;
public class floor_BinarySearch
{
    public static void main(String[] args)
    {
        int arr[] = {0,2,4,6,7,88,555};
        int tar = 88;
        
        System.out.println(search(arr,tar));
        
    }
    static int search(int[] arr,int tar)
    {
        if(tar < arr[0])
            return -1;
        
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end)
        {
            int mid = (start + end)/2;
            
            if(tar > arr[mid])
                start = mid + 1;
            else if(tar < arr[mid])
                end = mid - 1;
            else 
                return arr[mid-1];
        }
        
        return arr[end];   // floor logic..
    }
}