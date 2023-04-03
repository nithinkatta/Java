package Patterns;
import java.util.*;
public class Type1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i;
        for( i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
                space();
            star();
            for(int k=2;k<(i+i)-1;k++)
                space();
            
            if(i!=1)
            star();
            
            System.out.println();
        }
        i-=2;
        for(int row=1;row<num;row++)
        {
            for(int j=1;j<=row;j++)
                space();
            star();
            for(int k=(i+i)-1;k>2;k--)
                space();
            i--;
            if(row!=num-1)
            star();
            
            System.out.println();
        }
    }
    static void space()
    {
        System.out.print(" ");
    }
    static void star()
    {
        System.out.print("*");
    }
}