class Solution {
    public boolean isValid(String se) 
    {
        StringBuilder s=new StringBuilder(se);
        for(int i=0;i<s.length();i++)
        {
             if(i != s.length()-1)
             {
                // if(s.charAt(i)!=s.charAt(i+1))
                // {
                //     i++;
                // }
                if(s.charAt(i)=='(' && s.charAt(i+1)==')')
                {
                    s.delete(i,i+2);
                    i=-1;
                }
                else if(s.charAt(i)=='{' && s.charAt(i+1)=='}')
                {
                    s.delete(i,i+2);
                    i=-1;
                }
                else if(s.charAt(i)=='[' && s.charAt(i+1)==']')
                {
                    s.delete(i,i+2);
                    i=-1;
                }
                
            }
       }
        if(s.length()==0)
            {
                return true;
            }
        else return false;
    }
}