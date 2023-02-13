class Solution {
    public int countOdds(int low, int high) 
    {
        int c=0;
        if(low%2==1) c++;
        if(high%2==1) c++;
        if(low%2==1 && low==high) return 1;
        if(low%2==0 && low==high) return 0;
        if(low%2==0 && high %2==0)
        {
            c+=(high-low)/2;
        }
        else
        {
            c+=(high-low-1)/2;
        }
        return c;
    }
}