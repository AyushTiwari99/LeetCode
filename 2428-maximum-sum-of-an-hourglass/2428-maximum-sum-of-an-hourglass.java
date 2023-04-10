class Solution {
    public int maxSum(int[][] grid) 
    {
        int row = grid.length;
        int col = grid[0].length;
        int max=0;
        for(int i=0;i<row-2;i++)
        {
            int answer=0;
           for(int j=0;j<col-2;j++)
           {
               answer= grid[i][j]+grid[i][j+1]+grid[i][j+2];
               answer+=grid[i+1][j+1];
               answer+= grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
               if(answer>max) {
                max=answer;
            }
           }
            
        }
        return max;
    }
}