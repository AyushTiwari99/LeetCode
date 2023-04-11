class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        while(n>ans)
        {
            ans++;
            n-=ans;
        }
        return ans;
    }
}