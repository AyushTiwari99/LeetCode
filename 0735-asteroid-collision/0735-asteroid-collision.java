class Solution {
    public int[] asteroidCollision(int[] ast) {
        if(ast.length<=1) return ast;
        Stack<Integer> st = new Stack<>();
        for(int aste:ast)
        {
            if(aste>0) st.push(aste);
            else{
                while(!st.isEmpty() && st.peek()>0 && Math.abs(st.peek())<Math.abs(aste))
                    st.pop();
                if(st.isEmpty() || st.peek()<0)
                {
                    st.push(aste);
                }
                else if(st.peek() == Math.abs(aste)) st.pop();
            }
            
        }
        int[] output = new int[st.size()];
        for(int i= output.length-1;i>=0;i--)
        {
            output[i]=st.pop();
        }
        return output;
    }
}