/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package other;
import java.util.*;
/**
 *
 * @author nithin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int row = in.nextInt();
        int col = in.nextInt();
        
        ArrayList<Integer> arr_row = new ArrayList<>(row);
        ArrayList<Integer> arr_col = new ArrayList<>(row);
        
        char[][] ch = new char[row][col];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ch[i][j] = in.next().charAt(0);
                if(ch[i][j] == '^')
                {
                    arr_row.add(i);
                    arr_col.add(j);
                }
            }
        }
        int j=0;
        for(int i=0;i<2;i++)
        {
            if(arr_row.get(j) == arr_row.get(i))
            {
                arr_row.remove(i);
                arr_row.remove(j);
                break;
            }
        }
        j=0;
        for(int i=0;i<2;i++)
        {
            if(arr_col.get(j) == arr_col.get(i))
            {
                arr_col.remove(i);
                arr_col.remove(j);
                break;
            }
        }
        System.out.print(arr_row);
        System.out.print(" "+arr_col);
    }
    
}
