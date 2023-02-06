class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int arr[]=new int[2*n];
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=nums[a];
                a++;
            }
            else
            {
                arr[i]=nums[n];
                n++;
            }
        }
        return arr;
    }
}