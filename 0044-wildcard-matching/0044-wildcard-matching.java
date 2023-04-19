class Solution {
    public boolean isMatch(String inputString, String pattern) 
    {
        int i=0,j=0;
        int startidx = -1;
        int lastMatch = -1;
        while(i<inputString.length())
        {
            if(j<pattern.length() && (inputString.charAt(i)==pattern.charAt(j) || pattern.charAt(j)=='?'))
            {
                i++;
                j++;
            }
            else if(j<pattern.length() && pattern.charAt(j) == '*')
            {
                startidx=j;
                lastMatch=i;
                j++;
            }
            else if(startidx!=-1)
            {
                j=startidx+1;
                lastMatch++;
                i=lastMatch;
            }
            else
            {
                return false;
            }
        }
        boolean isMatch =true;
        while(j<pattern.length() && pattern.charAt(j)=='*')
        {
            j++;
        }
        if(i!=inputString.length() || j!=pattern.length())
        {
            isMatch=false;
        }
        return isMatch;
    }
}