package leetcode;
public class SmallestOfGreaterThanTarget_BinarySearch
{
    public static void main(String[] args)
    {
        char[] ch = {'c','f','j'};
        char tar = 'k';
        System.out.println(search(ch,tar));
    }
    static char search(char[] ch ,char tar)
    {
        int start = 0;
        int end = ch.length-1;
        
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            
            if(tar < ch[mid])
                end = mid - 1;
            else if(tar > ch[mid])
                start = mid + 1;  
            else 
                return ch[mid];
            
        }
        return ch[start % ch.length];
    }
}