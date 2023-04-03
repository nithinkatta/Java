package Patterns;
public class Type5
{
    public static void main(String[] args)
    {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int space = 1; space <= n-i; space++)
                System.out.print(" ");
            
            for(int col = 1,k = 0; col <= 2*i-1; col++)
            {
                if(col > i){
                    k = col-i;
                    System.out.print(k--);
                }
                else
                System.out.print(col);
            }
            System.out.println();
        }
    }
}