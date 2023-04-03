// example :- klmc = 42.0

package Assignments;
import java.util.*;
public class Alpha_Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] ch = new char[input.length()];
        
        int i;
        for(i=0;i<input.length();i++)
        {
            ch[i] = exchange(input.charAt(i));
        }
        //System.out.print(ch);
        i=0;
        char op = '0';
        double num1 = 0;
        double ans = Math.floor(Character.getNumericValue(ch[i++]));
        double num2 = 0;
        while(true)
        {
            while( ch[i] == '0' || ch[i] == '1' ||ch[i] == '2' ||ch[i] == '3' ||ch[i] == '4' ||ch[i] == '5' ||ch[i] == '6' ||ch[i] == '7' ||ch[i] == '8' ||ch[i] == '9')
            {
                num1 = Character.getNumericValue(ch[i]);
                ans = ans*10 + num1;
                i++;
            }
            op = ch[i++];
            
            if(op=='=')
                break;
            
            num2 = Math.floor(Character.getNumericValue(ch[i++]));
            int k=1;
            while(ch[i] == '0' || ch[i] == '1' ||ch[i] == '2' ||ch[i] == '3' ||ch[i] == '4' ||ch[i] == '5' ||ch[i] == '6' ||ch[i] == '7' ||ch[i] == '8' ||ch[i] == '9')
            {
                num1 = Character.getNumericValue(ch[i]);
                num2 = num2*10 + num1;
                i++;
                k++;
            }
            
            switch(op)
            {
                case '+': ans+=num2; break;
                case '-': ans-=num2; break;
                case '*': ans*=num2; break;
                case '/': ans/=num2; break;
                case '.': ans+=(num2/(10*k)); break;
            }
        };
        
        System.out.print((ans));
        
    }
    
    static char exchange(char in)
    {
        char out = ' ';
        char[][] temp = {
            {'a','.'},
            {'b','0'},
            {'c','='},
            {'d','+'},
            {'e','1'},
            {'f','2'},
            {'g','3'},
            {'h','-'},
            {'i','4'},
            {'j','5'},
            {'k','6'},
            {'l','*'},
            {'m','7'},
            {'n','8'},
            {'o','9'},
            {'p','/'}};
        
        for(int i=0;i<temp.length;i++)
            if(in == temp[i][0])
            {
                out = temp[i][1];
                break;
            }
        return out;
        
        
    }
}