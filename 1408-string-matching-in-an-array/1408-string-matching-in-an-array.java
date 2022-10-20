class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> l1=new ArrayList<>();
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[i].contains(words[j]) && i!=j)
                {
                    l1.add(words[j]);
                }
            }
        }
        h.addAll(l1);
        l1.clear();
        l1.addAll(h);
        
        return l1;
    }
}