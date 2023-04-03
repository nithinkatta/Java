
package Assignments;
import java.util.*;
public class AntiClockWise_45degree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] str = new String[5];
        char[][] ch = new char[5][5];
        int[][] arr = new int[5][5];
        int[][] temp_arr = new int[5][5];
        
        
        for(int i=0;i<5;i++){  
            str[i] = in.next();
            ch[i] = str[i].toCharArray();
            for(int j=0;j<5;j++)
                arr[i][j] = Character.getNumericValue(ch[i][j]);
        }
        
        temp_arr = rotate(arr);
        
        for(int[] i : temp_arr){
            for(int j : i)
                System.out.print(j);
            System.out.println();
        }
        // 45 degree rotation
        
    }
    static int[][] rotate(int[][] arr)
    {
        int temp_arr[][] = new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(arr[i][j] == 1)
                {
                    if(i<=2 && j==0 || j>=2 && i==4 )
                    {
                        temp_arr[i+2-j][j] = arr[i][j];
                    }
                    else if(i<=2 && j==4 || j>=2 && i==0)
                        temp_arr[0][j-2+i] = arr[i][j];
                    
                }
            }
        }
        return temp_arr;
    }
    
}
