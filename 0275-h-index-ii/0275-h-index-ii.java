class Solution {
    public int hIndex(int[] cit) 
    {
    //     if(cit.length%2==0) return cit[Math.floor(cit.length/2)]; 
    //     return cit[cit.length/2];
        int n= cit.length;
        for(int i=0;i<n;i++)
        {
            if(n-i<=cit[i])
            {
                return n-i;
            }
        }
        return 0;
    }
}