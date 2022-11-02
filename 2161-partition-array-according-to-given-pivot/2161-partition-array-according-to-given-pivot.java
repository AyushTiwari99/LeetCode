class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                l1.add(nums[i]);
            }
            if(nums[i]>pivot)
            {
                l2.add(nums[i]);
            }
            if(nums[i]==pivot)
            {
                c++;
            }
        }
        int k=0;
        for(int i : l1) nums[k++] = i;
        for(int i=0; i<c; i++) nums[k++] = pivot;
        for(int i : l2) nums[k++] = i;
        return nums;
    }
}