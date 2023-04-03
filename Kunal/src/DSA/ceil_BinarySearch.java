package DSA;

public class ceil_BinarySearch
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,4,5,16,17};
        int tar = 14;
        System.out.println(search(arr,tar));
    }
    
    static int search(int[] arr,int tar)
    {
        if(tar >= arr[arr.length-1])
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
                return arr[mid + 1];
        }
        
        return arr[start]; // ceiling of a number logic
    }
}