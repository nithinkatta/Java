package arrays;
import java.util.*;
public class ArrayList_Example
{
    public static void main(String[] args)
    {
        //Type-1
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        
        list.add(2);
        list.add(4545);
        list.add(23);
        
        for(int i=0;i<3;i++)
            list.add(in.nextInt());    // INput through console
        
        System.out.println(list);
        System.out.println(list.get(1));  // we can't use list[1]
        System.out.println(list.size());
        
        //Type-2
        ArrayList list2 = new ArrayList();
        
        list2.add(3);
        list2.add("nithin");
        list2.add(2.3);
        
        System.out.print(list2);
        
        
    }
}