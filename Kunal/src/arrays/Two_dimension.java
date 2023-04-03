package arrays;
import java.util.*;
public class Two_dimension
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = i*j;
            }
        }
        
        //type-1
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
                
        
        //type-2
        for(int[] i : arr)
        {
            for(int n : i)
                System.out.print(n);
            System.out.println();
        }
        
        //type-3
        for(int[] i : arr)
        {
            System.out.println(Arrays.toString(i));
        }
        
        //type-4
        System.out.print(Arrays.toString(arr[0]));
        
    }
}