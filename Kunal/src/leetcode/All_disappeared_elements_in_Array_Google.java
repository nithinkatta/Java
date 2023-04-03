
package leetcode;
import leetcode.*;
import java.util.*;

// Google interview question
public class All_disappeared_elements_in_Array_Google{

    public static void main(String[] args) {
        int arr[] = {3,1,0,2,2,4,4}; // the missing number is 4
        //System.out.print(Arrays.toString(arr));
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if(correct == arr.length)
            {
                i++;
                continue;
            }
            if(arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
                i++;
        }
        
    }
}
