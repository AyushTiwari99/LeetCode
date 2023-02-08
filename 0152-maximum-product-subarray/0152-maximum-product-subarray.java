class Solution {
    public int maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int p = 1;
        for(int i=0; i<arr.length; i++){
            p *= arr[i];
            max = Math.max(p, max);
            if(p == 0) p =1;
        }
        p = 1;
        for(int i=arr.length-1; i>=0; i--){
            p *= arr[i];
            max = Math.max(p, max);
            if(p == 0) p =1;
        }
        return max;
    }
}