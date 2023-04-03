package Assignments;
import java.util.*;

public class Flip_flop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String[] str = new String[5];
        char[][] ch = new char[5][5];
        int[][] arr = new int[5][5];
        
        for(int i=0;i<5;i++)
        {
            str[i] = in.next();
            ch[i] = str[i].toCharArray();
            for(int j=0;j<5;j++)
                if(ch[i][j] == '1')
                arr[i][j] = Character.getNumericValue(ch[i][j])-1;
                else
                    arr[i][j] = Character.getNumericValue(ch[i][j])+1;
        }
        for(int[] c : arr){
            for(int j : c)
                System.out.print(j);
            System.out.println();
        }
        
        
        
        
       
        
    }
}