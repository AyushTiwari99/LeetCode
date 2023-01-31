class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0) return 0;
        int n=height.length;
        int arrleft[]=new int[n];
        int arrright[]=new int[n];
        arrleft[0]=height[0];
        arrright[n-1]=height[n-1];
        for(int i=1;i<n;i++)
        {
            arrleft[i]=Math.max(arrleft[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            arrright[i]=Math.max(arrright[i+1],height[i]);
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            res+=Math.min(arrleft[i],arrright[i])-height[i];
        }
        return res;
    }
}