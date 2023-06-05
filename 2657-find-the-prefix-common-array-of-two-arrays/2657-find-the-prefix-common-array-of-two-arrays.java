class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int n =A.length;
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            boolean f=false;
            for(int j=0;j<B.length;j++)
            {
            if(A[i]==B[j])
            {
                f=true;
            }
            if(f && j>=i)
            {
                arr[j]++;
            }
            }
        }
        return arr;
    }
}