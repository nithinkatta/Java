package google;
import java.util.*;

public class Default
{
    public static void problem()
    {
        
//        System.out.print("hi");

    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        int i=1;
        while(test!=0)
        {
            problem();
            System.out.println("Case #"+(i++)+":");
            test--;
        }
    }
}