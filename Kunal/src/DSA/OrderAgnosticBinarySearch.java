package DSA;

// By this program we can do binarysearch on both ascending and descending order
public class OrderAgnosticBinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,6};
        int tar = 6;
        
        int j = oabs(arr,tar);
        if(j==1)
            System.out.println("found");
        else 
            System.out.println("not found");
        
    }
    static int oabs(int[] arr,int tar)
    {
        int start = 0;
        int end = arr.length - 1;
        boolean Asce = arr[start] < arr[end];
        
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            
            if(tar == arr[mid])
                return 1;
            
            if(Asce)                // Ascending order 
                if(tar > arr[mid])
                    start = mid + 1;
                else 
                    end = mid-1;
            else                    // Descending order
                if(tar < arr[mid])
                    start = mid + 1;
                else 
                    end = mid-1;  
        }
        return -1; 
    }
}