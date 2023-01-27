class Solution {
    public int numIslands(char[][] grid) 
    {
        if(grid==null || grid.length==0 || grid[0].length==0)
        {
            return 0;
        }
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int row,int col)
    {
        if(row<0 || row>=grid.length || col<0 || col>=grid[row].length|| grid[row][col]!='1')
        {
            return;
        }
        grid[row][col]='0';
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
    }
}