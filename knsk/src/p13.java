import java.util.Scanner;
public class p13{
    public static void main(String[] args) {
      Scanner n=new Scanner(System.in);
      
        int days;
        {
           System.out.println("Enter number of days");
        days=n.nextInt();
        }
        if(days > 0 && days <= 5)
        {
            System.out.println("fine is 50 paise");
        }
        else if(days>=6&&days<=10)
        {
            System.out.println("fine is 1 Rupee");
        }
        else if(days>=10&&days<30) 
        {
            System.out.println("fine is 5 rupees");
        }
        else
        {
            System.out.println("cancle the memebership");
        }
      }
    }