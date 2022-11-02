class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String ans="";
        if(num<0)
        {
            while(num!=0)
            {
                ans= String.valueOf(-num%7)+ans;
                num/=7;
            }
            return "-"+ans;
        }
        else
        {
        while(num!=0)
        {
            ans= String.valueOf(num%7)+ans;
            num/=7;
        }
        }
        return ans;
    }
}