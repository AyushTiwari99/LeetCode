class Solution {
    public int majorityElement(int[] nums) {
        int count  = 1;
        int idx = 0;
        for(int i = 1 ; i < nums.length ; i++){
            count+= nums[i] == nums[idx] ? 1:-1;
            if(count==0){
                idx = ++i;
                count++;
            }
        }
        return nums[idx];     
    }
}