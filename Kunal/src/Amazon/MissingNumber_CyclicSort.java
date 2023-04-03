
package Amazon;
import leetcode.*;
import java.util.*;

//cyclic sort
// amazon interview question
public class MissingNumber_CyclicSort {

    public static void main(String[] args) {
        int arr[] = {3,1,0,2}; // the missing number is 4
        //System.out.print(Arrays.toString(arr));
        System.out.println("missing number is: "+sort(arr));
        
    }
    public static int sort(int[] arr)
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
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }
}
