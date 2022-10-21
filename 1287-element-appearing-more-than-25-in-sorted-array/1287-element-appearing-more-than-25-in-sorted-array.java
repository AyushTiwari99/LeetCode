class Solution {
    public int findSpecialInteger(int[] arr) 
    {
        if(arr.length==1 || arr.length==2) return arr[0];
        int n=arr.length;
        int bound=(n*25)/100;
        int c=1;
        int fr=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                c++;
                if(c>(double)bound)
                {
                    return arr[i-1];
                }
            }
            else
            {
                fr=Math.max(c,fr);
                // if(fr>(double)bound)
                // {
                //     return arr[i-1];
                // }
                c=1;
            }
        }
        return 0;
    }
}