class Solution {
    public int divide(int dividend, int divisor) 
    {
        if(dividend == 1<<31 && divisor == -1) return Integer.MAX_VALUE;
        boolean sign=(dividend>=0) ==(divisor>=0) ? true:false;
        int a=Math.abs(dividend);
        int b=Math.abs(divisor);
        int result=0;
        while(a-b>=0)
        {
            int count=0;
            while(a-(b << 1<< count)>=0)
            {
                 count++;
            }
           
            result += 1 << count;
            a -= b << count;
        }
        return sign?result:-result;
    }
}