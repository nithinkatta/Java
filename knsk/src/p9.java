import java.util.Scanner;

public class p9{
public static void main(String[]args){
 String option;   
int ans,points=0;
Scanner S=new Scanner(System.in);
System.out.println("Do you want to play the quiz");
option=S.next();
if(option.equalsIgnoreCase("yes"));
{
    System.out.println("question1:|n who is the founder");
System.out.println("enter your option:");
ans=S.nextInt();
if(ans==2)
{
    System.out.println("correct");
    points=points+5;
    System.out.println("points secured="+points);
    System.out.println("question2:|n who is the founder of java");
    ans=S.nextInt();    
if(ans==1)
{
System.out.println("correct");
points=points+5;
System.out.println("points secured="+points);
}
else
{
 System.out.println("inncorrect");
}
}
}
}
}