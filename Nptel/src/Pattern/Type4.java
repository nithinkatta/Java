package Pattern;
import java.util.*;
public class Type4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	  int l = inr.nextInt();
        // Add the necessary code in the below space
      if(l%2==0 || l<0)
      {
        System.out.println("Invalid line number");
      }
      else
      {
        
        for(int j=1;j<=l/2+1;j++)
        {
          for(int k=0;k<=l/2-j;k++)
          {
            System.out.print(" ");
          }
          for(int m=1;m<=j;m++)
          {
            System.out.print("* ");
          }
          System.out.println();
        }
        for(int j=1;j<=(l/2);j++)
        {
          for(int k=1;k<j;k++)
          {
            System.out.print(" ");
          }
          for(int i=j;i<=(l/2);i++)
          {
            System.out.print(" *");
          }
          System.out.println();
        }
      }
    }
}
             