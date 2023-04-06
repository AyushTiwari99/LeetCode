class Solution {
    public String frequencySort(String s) 
    {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> p=new PriorityQueue<>((a,b)->h1.get(b)-h1.get(a));
        p.addAll(h1.keySet());
        StringBuilder sb=new StringBuilder();
        while(!p.isEmpty())
        {
            char ch=p.remove();
            for(int i=0;i<h1.get(ch);i++)
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}