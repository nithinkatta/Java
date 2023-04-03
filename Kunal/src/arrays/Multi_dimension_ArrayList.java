package arrays;
import java.util.*;

public class Multi_dimension_ArrayList
{
    public static void main(String[] args)
    {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<3;i++)
            list.add(new ArrayList());
        
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                list.get(i).add(j*i);
            
        
        System.out.println(list);
        
    }
}