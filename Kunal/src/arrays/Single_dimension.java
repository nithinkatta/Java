 
package arrays;
import java.util.*;
public class Single_dimension {

    public static void main(String[] args) {
        
        int[] arr = new int[3];
        
        for(int i=0;i<arr.length;i++)
            arr[i] = i*i;
        
        // type-1 
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
        // type-2
        for(int i : arr)
            System.out.print(i);
        
        // type-3;
        System.out.print(Arrays.toString(arr));
        
    }
    
}
