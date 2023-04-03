package other;

import java.util.*;
public class sudoku
{
    static ArrayList<Integer> vals = new ArrayList<Integer>();
    public static void main(String[] args)
    {
         int sudoku[][] = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                            {5, 2, 0, 0, 0, 0, 0, 0, 0},
                            {0, 8, 7, 0, 0, 0, 0, 3, 1},
                            {0, 0, 3, 0, 1, 0, 0, 8, 0},
                            {9, 0, 0, 8, 6, 3, 0, 0, 5},
                            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
                            {1, 3, 0, 0, 0, 0, 2, 5, 0},
                            {0, 0, 0, 0, 0, 0, 0, 7, 4},
                            {0, 0, 5, 2, 0, 6, 3, 0, 0} 
         };
         if(rowVal(sudoku))
             if(colVal(sudoku))
                 if(box(sudoku))
                     System.out.print(true);
                 else
                     System.out.print(false);
             else
                 System.out.print(false);
         else
             System.out.print(false);
         
         
    }
    public static boolean rowVal(int[][] arr)
    {
     
        for(int row[]: arr){

            // adding all the values
            for(int val: row){
                if(val != 0){
                    vals.add(val);
                }
            }

            //System.out.println(vals);
            for(int i=0;i<vals.size()-2;i++)
                for(int j=i+1;j<vals.size()-1;j++)
                    if(vals.get(i)==vals.get(j))
                        return false;
            vals.clear();
        }
        return true;
    }
    public static boolean colVal(int[][] arr)
    {

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
                if(arr[j][i] != 0)
                    vals.add(arr[j][i]);

            //System.out.println(vals);
            for(int k=0;k<vals.size()-2;k++)
                for(int j=k+1;j<vals.size()-1;j++)
                    if(vals.get(k)==vals.get(j))
                        return false;
            vals.clear();
        }
        return true;
    }
    
    public static boolean box(int[][] arr)
    {
        int newRow = 0;
        int newCol = 0;
        for(int rowMat = 0; rowMat < 3; rowMat++)
        {
            for(int colMat = 0; colMat < 3; colMat++)
            {
                for(int row = newRow;row< newRow+3;row++)
                    for(int col = newCol;col<newCol+3;col++)
                    {
                        if(arr[row][col] != 0)
                            vals.add(arr[row][col]);
                    }
                for(int k=0;k<vals.size()-1;k++)
                    for(int j=k+1;j<vals.size();j++)
                        if(vals.get(k)==vals.get(j))
                            return false;
                newCol+=3;
                vals.clear();
            }
            newCol = 0;
            newRow += 3;
            
        }
        return true;
    }
}