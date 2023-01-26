class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int sum=0;
        int disum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            disum+=dsum(nums[i]);
        }
        return Math.abs(sum-disum);
    }   
    int dsum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}