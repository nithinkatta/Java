import java.util.Scanner;
public class p12 {
    public static void main(String[] args){
    Scanner A=new Scanner(System.in);
    double x,y;
        System.out.println("enter x:");
        x=A.nextDouble();
        System.out.println("enter y:");
        y=A.nextDouble();
        x=Math.round(x*1000);
        x=x/1000;
        y=Math.round(y*1000);
        y=y/1000;
        if(x==y)
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("not same");
        }
    }
}