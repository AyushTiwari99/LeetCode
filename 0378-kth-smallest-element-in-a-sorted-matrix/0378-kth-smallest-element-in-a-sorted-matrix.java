class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                l.add(matrix[i][j]);
                
            }
        }
        Collections.sort(l);
        return l.get(k-1);
    }
}