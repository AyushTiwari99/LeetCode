class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> dq = new ArrayDeque<>();
        for(int i = 0; i < num.length(); ++i){ //case -1
            char ch = num.charAt(i);
            
            while(dq.size() > 0 && k > 0 && dq.getLast() > ch){
                dq.removeLast();
                k--;
            }
            dq.addLast(ch);
        }
        while(dq.size() > 0 && k > 0){
            dq.removeLast(); 
            k--;
        } 
        while(dq.size() > 0 && dq.getFirst() == '0'){ 
            dq.removeFirst();           
        }       
        if(dq.size() == 0) return "0";  
        StringBuilder res = new StringBuilder();
        while(dq.size() > 0){
            res.append(dq.removeFirst());
        }
        return res.toString();
    }
}