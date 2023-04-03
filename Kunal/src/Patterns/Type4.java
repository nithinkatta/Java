package Patterns;
public  class Type4
{
    public static void main(String[] args)
    {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n)
    {
        for(int row = 1; row <= 2*n; row++)
        {
            int totalCols = row > n? 2*n - row: row;
            
            int totalSpaces = n - totalCols;
            
            for(int space = 1; space <= totalSpaces; space++)
                System.out.print(" ");
            
            for(int col = 1; col <= totalCols; col++)
                System.out.print("* ");
            
            System.out.println();
        }
    }
}