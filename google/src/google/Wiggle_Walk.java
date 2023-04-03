package google;
import java.util.*;
public class Wiggle_Walk
{
    static int no_of_dir,row,col,c_row,c_col;
    static char[] dir;
    static int op_row[] = new int[10];
    static int op_col[] = new int[10];
    static int temp=0;
    
    
    static int temp_arr[][];
    
    static void input_data()
    {
        
        String direction;
        
        Scanner input = new Scanner(System.in);
        
        no_of_dir = input.nextInt();
        row = input.nextInt();
        col = input.nextInt();
        c_row = input.nextInt()-1;
        c_col = input.nextInt()-1;
        direction = input.next();
        
        dir = direction.toCharArray();
        
        
        
        temp_arr = new int[row][col];
        
        temp_arr[c_row][c_col] = 1;    //  current position is 1
        
        
        robot();
        
        op_row[temp] = c_row+1;
        op_col[temp] = c_col+1;
        temp++;
    }
    
    static void robot()
    {
        
        
        
        for(int i = 0; i < no_of_dir; i++)
        {
            
            if(dir[i] == 'E')
            {
                E();
            }
            
            if(dir[i] == 'W')
            {
                W();
            }
            
            if(dir[i] == 'N')
            {
                N();
            }
            
            if(dir[i] == 'S')
            {
                S();
            }
        }
        
         
    }
    
    // E function()
    static void E()
    {
        c_col++;
        
        if(temp_arr[c_row][c_col] != 1)
        {
            temp_arr[c_row][c_col] = 1;
        }
        else
        {
            E();
        }
        
    }
    
    static void W()
    {
        c_col--;
        
        if(temp_arr[c_row][c_col] != 1)
        {
            temp_arr[c_row][c_col] = 1;
        }
        else
        {
            W();
        }
        
    }
    
    static void N()
    {
        c_row--;
        
        if(temp_arr[c_row][c_col] != 1)
        {
            temp_arr[c_row][c_col] = 1;
        }
        else
        {
            N();
        }
        
    }
    
    static void S()
    {
        c_row++;
        
        if(temp_arr[c_row][c_col] != 1)
        {
            temp_arr[c_row][c_col] = 1;
        }
        else
        {
            S();
        }
        
    }
    
    
    public static void main(String[] args)
    {
        int no_of_tasks,t;
        
        
        Scanner input = new Scanner(System.in);
        no_of_tasks = input.nextInt();
        
        t = no_of_tasks;
        
        
        while(no_of_tasks != 0)
        {
            input_data();
            no_of_tasks = no_of_tasks - 1;
        }
        
        for(int i = 1; i <= t; i++)
        {
            System.out.println("Case #"+i+ ": " +op_row[i-1]+ " " +op_col[i-1]);
        }
         
    }
}
