package arrays;
import java.util.*;
public class Reverse_an_Array
{
    public static void main(String[] args)
    {
        int[] list = new int[4];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<4;i++)
            list[i] = in.nextInt();
        
        System.out.println(max(list));
        
    }
    public static String max(int[] arr)
    {
        
        for(int i=0,j=arr.length-1;i<arr.length/2 && i!=j;i++,j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        return Arrays.toString(arr);
    }
}