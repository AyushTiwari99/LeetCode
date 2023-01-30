class Solution {
    public int findCenter(int[][] ed)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<ed.length;i++)
        {
            for(int j=0;j<ed[0].length;j++)
            {
                h.put(ed[i][j],h.getOrDefault(ed[i][j],0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: h.entrySet())
        {
            if(entry.getValue()==ed.length)
            {
                return entry.getKey();
            }
        }
        return 0;
    }
}