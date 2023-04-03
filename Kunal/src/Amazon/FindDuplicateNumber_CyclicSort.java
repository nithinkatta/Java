package Amazon;
import java.util.*;


// Cyclic sort
public class FindDuplicateNumber_CyclicSort {

    public static void main(String[] args) {
        int arr[] = {1,2,2,5,3,6,4};
        fun(arr);
    }
    
    public static void fun(int arr[])
    {
        
        
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]!=i+1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct])
                {
                    int temp = arr[i] ;
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else 
                    break;
            }else
                i++;
        }
//        for(int j=0;j<l.size();j++)
//        {
//            System.out.print(l.get(j)+" ");
//        }
        System.out.print(arr[i]);
    }
    
}
