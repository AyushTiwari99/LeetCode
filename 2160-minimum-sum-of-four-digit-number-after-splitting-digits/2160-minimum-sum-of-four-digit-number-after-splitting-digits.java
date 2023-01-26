class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        String s=arr[0]+""+arr[3];
        String t=arr[1]+""+arr[2];
        return Integer.valueOf(s)+Integer.valueOf(t);
    }
}