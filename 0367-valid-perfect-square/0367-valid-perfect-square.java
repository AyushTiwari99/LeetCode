class Solution {
    public boolean isPerfectSquare(int num) {
        long lo = 0 ;
        long hi = num ;
        while(lo<=hi)
        {
            long mid = (hi-lo)/2+lo;
            if(mid*mid==num)
            {
                return true;
                
            }
            else if(mid*mid<num)
            {
                lo=mid+1;
            }
            else 
            {
                hi = mid-1;
            }
        }
        return false;
    }
}