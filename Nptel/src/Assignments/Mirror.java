package Assignments;

import java.util.*;
public class Mirror
{
    public static void main(String[] args)
    {
        char[][] arr = new char[5][5];
        Scanner in = new Scanner(System.in);
        
        String str[] = new String[5];
        
        for(int i=0;i<5;i++)
            str[i] = in.next();
        
        for(int i=0;i<5;i++)
            for(int j=0,k=4;j<5 && k>=0;j++,k--)
                arr[i][j] = str[i].charAt(k);
        
        for(char[] i : arr)
        {
            for(char j : i)
                System.out.print(j);
            System.out.println();   
        }
        
    }
}