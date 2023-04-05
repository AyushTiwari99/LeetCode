class Solution {
    public int longestSubstring(String s, int k) 
    {
        return helper(s.toCharArray(),0,s.length(),k);
    }
    int helper(char[] arr,int start,int end,int k)
    {
        if(end-start<k) return 0;
        int [] count=new int[26];
        for(int i=start;i<end;i++)
        {
            count[arr[i]-'a']++;
        }
        for(int i=start;i<end;i++)
        {
            if(count[arr[i]-'a']<k)
            {
                int j=i+1;
                while(j<end && count[arr[j]-'a']<k)
                {
                    j++;
                }
                return Math.max(helper(arr,start,i,k),helper(arr,j,end,k));
            }
        }
        return end-start;
    }
}