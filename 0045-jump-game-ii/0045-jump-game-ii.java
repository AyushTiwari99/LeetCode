class Solution {
    public int jump(int[] nums) {
        int res = 0;
        int l = 0; int r = 0;
        int farthest = 0;
        while(r < nums.length-1)
        {
            for(int i = l; i < r + 1; i++)
            {
                farthest = Math.max(farthest,nums[i]+i);
            }
            l = r + 1;
            r = farthest;
            res++;
        }
        return res;
    }
}