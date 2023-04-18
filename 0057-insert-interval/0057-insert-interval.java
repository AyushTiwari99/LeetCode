class Solution {
    public int[][] insert(int[][] inter, int[] newI)
    {
        ArrayList<int[]> l =new ArrayList<>();
        for(int[] cur: inter)
        {
            if(cur[1]<newI[0])
            {
                l.add(cur);
            }
            else if(cur[0]>newI[1])
            {
                l.add(newI);
                newI=cur;
            }
            else{
                newI[0]= Math.min(newI[0],cur[0]);
                newI[1]= Math.max(newI[1],cur[1]);
            }
        }
        l.add(newI);
        return l.toArray(new int[l.size()][]);
    }
}