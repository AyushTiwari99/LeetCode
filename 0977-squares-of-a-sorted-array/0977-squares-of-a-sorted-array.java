class Solution {
    public int[] sortedSquares(int[] arr) 
    {
        int n=arr.length;        
        int k=n-1;
        int i=0;
        int j=n-1;
        int arr1[]=new int[n];
        while(i<=j)
        {
           if(arr[i]*arr[i]>arr[j]*arr[j])
           {
               
               arr1[k]=arr[i]*arr[i];
                   k--;
               i++;
           }
            else
            {
                arr1[k]=arr[j]*arr[j];
                k--;
                j--;
            }
        }
        return arr1;        
    }
}