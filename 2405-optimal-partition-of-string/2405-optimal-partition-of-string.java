class Solution {
    public int partitionString(String s) 
    {
        HashSet<Character> hs= new HashSet<>();
        int ans=1;
        for(int i=0;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                ans++;
                hs.clear();
                hs.add(s.charAt(i));
            }
            else
            {
                hs.add(s.charAt(i));
            }
        }
        return ans;
    }
}