class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
        for(int i=0; i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int t = m[i][j];
                m[i][j] = m[i][n-j-1];
                m[i][n-j-1] = t;
            }
            // System.out.println();
        }
    }
}