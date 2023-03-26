class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i:nums)System.out.println(i);
        
        return nums[nums.length-k];
    }
}