class Solution {
    public int findCenter(int[][] ed)
    {
        int edgezero=0;
        int edgeone=0;
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<1;j++)
            {
               if(ed[i][j]==ed[i+1][j] || ed[i][j]==ed[i+1][j+1])
               {
                   edgezero=ed[i][j];
                   return edgezero;
               }
                else
                {
                    return ed[i][j+1];
                }
            }
        }
       
        return 0;
    }
}