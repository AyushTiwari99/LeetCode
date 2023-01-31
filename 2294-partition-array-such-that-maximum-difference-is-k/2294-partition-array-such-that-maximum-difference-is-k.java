class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count =1;
        int st=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[st]>k)
            {
                st=i;
                count++;
            }
        }
        return count;
    }
}