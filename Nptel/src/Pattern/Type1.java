import java.util.*;
public class Type1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
        // Add the necessary code in the below space
        if(n<1)
            n=0;
       for(int i=1; i<=n; i++)
       {
         for(int j=0; j<n-i; j++)
         {
           System.out.print("  ");
         }
         for(int j=1; j<=(i+i)-1; j++)
         {
           
             System.out.print("* ");
           
         }
         System.out.println();
       }
        System.out.println(n*n);
    }
}