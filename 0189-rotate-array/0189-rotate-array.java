class Solution {
    public void inv(int[] arr, int a, int b){
        while(a<=b)
        {
            int temp=arr[a];
            arr[a++]=arr[b];
            arr[b--]=temp;
        }
        // for(int i:arr) System.out.print(i);
    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        // inv(arr, 0, n-k-1);
        // inv(arr, n-k, n-1);
        // inv(arr, 0, n-1);
        
        inv(arr, 0, n-1);
        inv(arr, 0, k-1);
        inv(arr, k, n-1);
    }
}