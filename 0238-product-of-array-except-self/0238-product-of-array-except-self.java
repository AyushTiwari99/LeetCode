class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr1[]=new int[n];
        int temp=1;
        for(int i = 0;i<n;i++)
        {
            arr1[i]=temp;
            temp=temp*nums[i];
        }
        temp=1;
        for(int i = n-1; i>=0;i--)
        {
            arr1[i]=temp*arr1[i];
            temp=temp*nums[i];
        }
        return arr1;
    }
}