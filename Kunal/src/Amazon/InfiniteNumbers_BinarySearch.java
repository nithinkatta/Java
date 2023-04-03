
package Amazon;

public class InfiniteNumbers_BinarySearch {

    
    public static void main(String[] args) {
    
        int arr[] = {2,3,5,6,7,8,9,9,67,88,100,101,102,299};
        int tar = 299;
        int start = 0;
        int end = 1;
        
        while(tar > arr[end])
        {
            int temp = end + 1;
            
            end = end + (end - start + 1)*2; /* logic for partition of an undefined array size
            ex: [2,3]  [5,6,7,8]  [9,9,67,88,.....]
            */
            start = temp;
        }
        if(search(arr,tar,start,end))
            System.out.print("found");
        else
            System.out.print("Not found");
    }
    static boolean search(int[] arr,int tar,int start,int end)
    {
        
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(tar > arr[mid])
                start = mid + 1;
            else if(tar < arr[mid])
                end = mid - 1;
            else{
                return true;
            }   
        }
        return false;
    }
    
}
