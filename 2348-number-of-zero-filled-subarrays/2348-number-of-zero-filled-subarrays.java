class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long numSub = 0;
        for (int num : nums) {
            if (num == 0)
                numSub++;
            else
                numSub = 0;
            ans+=numSub;
        }
        
        return ans;
    }
}