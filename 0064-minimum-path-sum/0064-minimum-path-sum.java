class Solution {
    public int minPathSum(int[][] grid) 
    {
        int r=grid.length;
        int c=grid[0].length;
        int arr[][]=new int[r][c];
        arr[0][0]=grid[0][0];
        for(int i=1;i<c;i++)
        {
            arr[0][i]=grid[0][i]+arr[0][i-1];
        }
        for(int i=1;i<r;i++)
        {
            arr[i][0]=grid[i][0]+arr[i-1][0];
        }
        for(int i=1;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                arr[i][j]=Math.min(arr[i-1][j],arr[i][j-1])+grid[i][j];
            }
        }
        return arr[r-1][c-1];
    }
}