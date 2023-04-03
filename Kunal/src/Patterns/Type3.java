package Patterns;

public class Type3
{
    public static void main(String[] args)
    {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n)
    {
        for(int row = 1;row <= 2*n;row++)
        {
            int totalCol = row > n? 2*n - row: row;
            for(int col = 1;col <= totalCol;col++)
                System.out.print("*");
            System.out.println();
        }
    }
}