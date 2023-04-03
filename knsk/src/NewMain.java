import java.util.*;
import java.io.*;



class NewMain{
    public static void main(String []argh)
    {



        String name = "maddm";
        int n= name.length();
        char arr[] = new char[n];
        
        arr = name.toCharArray();
        
        boolean b = true;
        for(int i=0,j=n-1; i<n/2 && j>n/2; i++,j--)
        {
            if(arr[i] == arr[j])
                b = true;
            else
            {
                b = false;
                break;
            }
        }
        if(b)
        {
            System.out.print("pal");
        }
        else
            System.out.print("not pal");

       
    }
}



