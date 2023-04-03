package Pattern;
import java.util.*;
public class Type2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	    int l = inr.nextInt();
        // Add the necessary code in the below space
      for(int i=1; i<=l; i++)
      {
        for(int j=1; j<=l-i; j++)
        {
          System.out.print(" ");
        }
        for(int j=l; j>l-i; j--)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
}
