package DSA.Sorting;
import java.util.*;

// Putting the max element at last of an array
public class SelectionSort
{
    public static void main(String[] args)
    {
        int arr[] = { 4,5,3,2,1};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    public static int getMaxIndex(int[] arr,int start,int last)
    {
        int max = start;
        for(int i=start;i<=last;i++)
        {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }
    public static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}