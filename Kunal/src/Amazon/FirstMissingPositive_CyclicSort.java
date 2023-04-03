package Amazon;

// Hard question of cyclic sort from leetcode
class FirstMissingPositive_CyclicSort
{
    public static void main(String[] args)
    {
        int arr[] = {0,-1,3,2,1,5}; // find the first positive missing number i.e 4
        int n = fun(arr);           // ignore -ve no's and 0
        System.out.println(n);
    }
    public static int fun(int arr[])
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i]>0 && arr[i]<= arr.length && arr[i]!=arr[correct]) // avoid -ve no's and 0
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
                i++;
        }
        for(int j= 0;j<arr.length;j++)
        {
            if(arr[j] != j+1)
            return j+1;
        }
        return arr.length+1;
    }
}