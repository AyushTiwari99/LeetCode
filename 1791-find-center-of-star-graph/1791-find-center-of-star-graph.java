class Solution {
    public int findCenter(int[][] edges)
    {
        int n=edges.length+1;
        int[] edgecount=new int[n+1];
        for(int[] edge :edges)
        {
            int x=edge[0];
            int y=edge[1];
            edgecount[x]++;
            edgecount[y]++;
            if(edgecount[x]>1)
            {
                return x;
            }
            if(edgecount[y]>1)
            {
                return y;
            }
        }
        return 0;
    }
}