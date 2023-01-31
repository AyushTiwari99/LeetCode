class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int wsum=0;
        for(int i=0;i<k;i++)
        {
            wsum+=arr[i];
        }
        int msum=0;
        msum=Math.max(wsum,msum);
        int count=0;
        if((msum/(1.0*k))>=threshold) count++;
        for(int i=k;i<arr.length;i++)
        {
            wsum+=arr[i]-arr[i-k];
            if((wsum/(1.0*k))>=threshold) count++;
            msum=Math.max(wsum,msum);
        }
        return count;
    }
}