class Solution {
    public boolean isMonotonic(int[] nums) {
        int a=0;
        int b=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=nums[i-1])
            {
                a++;
            }
        }if(a==nums.length-1) return true;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                b++;
            }
        }if(b==nums.length-1) return true;
        return false;
    }
}