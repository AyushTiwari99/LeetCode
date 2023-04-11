class Solution {
    public int hIndex(int[] cit) 
    {
        int n=cit.length;
        int x=0;
        int y=n;
        int ans=0;   
    while(x<y)
    {
        int mid = x+(y-x)/2;
        if(n-mid<=cit[mid])
        {
            ans = Math.max(n-mid,ans);
            y=mid;
        }
        else
        {
            x =mid+1;
        }
    }
        return ans;
    }
}