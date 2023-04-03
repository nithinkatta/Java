package Pattern;
import java.util.*;
  public class Type3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
        // Add the necessary code in the below space
        
      int sum = 0;
      if(n < 0)
          sum=0;
      for(int i=1; i<=n; i++)
      {
        for(int j=1; j<=n-i; j++)
        {
          System.out.print("  ");
        }
        int num = 1;
        for(int j=1; j<=(i+i)-1; j++)
        {
          System.out.print(num+" ");
          
          sum += num;
          num++;
        }
        System.out.println();
        
      }
        System.out.println(sum);
    }
  }