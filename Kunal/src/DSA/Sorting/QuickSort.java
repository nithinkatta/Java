
package DSA.Sorting;

import java.util.*;
public class QuickSort {

    
    public static void main(String[] args) {
        int arr[] = { 3,9,4,1,7,0 };
        sort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
        
    }
    
    public static void sort(int[] arr,int low,int high)
    {
        if(low >= high)
            return;
        int s = low;
        int e = high;
        
        // pivot element
        int mid = (low + high)/2;   
        while(s <= e)
        {
            while(arr[s] < arr[mid])
                s++;
            while(arr[e] > arr[mid])
                e--;
            
            if(s <= e)
            {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }
    
}
