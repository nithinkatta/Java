package Conversion;
import java.util.*;

public class NewMain
{
    public static void main(String[] args)
    {
        
        char c_num = '6';
        int numb = Integer.parseInt(String.valueOf(c_num));
        System.out.println(numb);
        
        // Array to string :- Arrays.toString(int[]);
        
        int[] arr = {1,2,3,4,5,2};
        System.out.println(Arrays.toString(arr));
        
        // Char to numeric value :- Character.getNumericValue(char[]);
        
        char[] ch = {'6','3','u','s'};
        System.out.println(Character.getNumericValue(ch[0]));
        
        // String to char array :- str.toCharArray();
        
        String str = "Nithin";
        char c[] = str.toCharArray();
        System.out.println(c);
    }
}