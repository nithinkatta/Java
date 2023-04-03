
package leetcode;

// peak mountain array
// This problem is also called as bitonic array

public class BitonicArray_BinarySearch {

    public static void main(String[] args) {
  
        int arr[] = {1,2,3,5,7,6,2,1}; // bitonic array : find last numb of ascending order
        int tar = bitonic(arr);
        System.out.println(arr[tar]);
        
    }
    static int bitonic(int[] arr)
    {
        int tar = -1;
        int start =0;
        int end = arr.length - 1;
        while(start <= end)
        {
            
            int mid = start + (end - start)/2;
           
            if(arr[mid] > arr[mid+1])
            {
                tar = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return tar;
    }
    
}
