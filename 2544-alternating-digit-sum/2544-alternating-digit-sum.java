class Solution {
    public int alternateDigitSum(int n)
    {
        StringBuilder s=new StringBuilder();
        s.append(String.valueOf(n));
        s.reverse();
        int x=s.length();
        int num=Integer.valueOf(s.toString());
        int sum=0;
        for(int i=0;i<x;i++)
        {
            if(i%2==0)
            {
                sum+=num%10;
                num/=10;
            }
            else
            {
                sum-=num%10;
                num/=10;
            }
        }
        return sum;
    }
}