package Amazon;

// cyclic sort
class FindAllMissingNumbers_CyclicSort
{
    public static void main(String args[])
    {
        
        int arr[] = {5,3,3,2,2,1}; // in a sequence, 4 and 6 are missing 
        fun(arr);
    }
    public static void fun(int arr[])
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i] -1;
            if(arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
                i++;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
                System.out.print(j+1+" ");
        }
    }
}