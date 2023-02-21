class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        System.out.println(s);
        int p1=0;
        int p2=s.length()-1;
        while(p1<p2)
        {
            Character a=s.charAt(p1);
            Character b=s.charAt(p2);
            if(!Character.isLetterOrDigit(a)) 
            {
                p1++;
                continue;
            }
            if(!Character.isLetterOrDigit(b))
            {
                p2--;
                continue;
            }
            if(a!=b) return false;
            p1++;
            p2--;                    
        }
        return true;
    }
}