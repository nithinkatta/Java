package Amazon;
import java.util.*;


// Cyclic sort
public class FindAllDuplicateNumbers_CyclicSort {

    public static void main(String[] args) {
        int arr[] = {1,2,2}; // here the 3 number is missing and 2 is repeating so the ans is 2 and 3 values
        int l[] = fun(arr);
        for(int i=0;i<l.length;i++)
        System.out.print(l[i]+" ");
    }
    
    public static int[] fun(int nums[])
    {
        int i =0;
        while(i<nums.length)
        {
            int correct = nums[i] -1;
            if(nums[i] != nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
            i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            return new int[] {nums[j],j+1};
        }
        return new int[]{-1};

    }
    
}
