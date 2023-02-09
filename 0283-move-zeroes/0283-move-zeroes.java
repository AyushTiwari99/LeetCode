class Solution {
    public void moveZeroes(int[] arr) {
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[s];
                arr[s]=arr[i];
                arr[i]=temp;
                s++;
            }
        }
    }
}