class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right)
        {
            int lh=height[left];
            int rh=height[right];
            int h_min=Math.min(lh,rh);
            int len=right-left;
            int cur=h_min*len;
            max=Math.max(max,cur);
            if(lh<rh)
            {
                left++;
            }
            else right--;
        }
        return max;
    }
}