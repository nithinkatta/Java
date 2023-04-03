import java.util.Scanner;
public class p8{
    public static void main(String[] args) {
   Scanner S=new Scanner(System.in);
   int month;
        System.out.println("enter a month");
        month=S.nextInt();
        if(month==12||month==1||month==12)
        {
            System.out.println("entered month is winnter");
        }
         else if(month==3||month==4||month==5)
        {
        System.out.println("entered month is spring");
        }
         else if(month==6||month==7||month==8)
         {
        System.out.println("entered month is summer");
         }
         else if (month==9||month==10||month==11)
         {
         System.out.println("entered month is monsoon");
         }
        else
         {
             System.out.println("invalid month");
         }
    }
}