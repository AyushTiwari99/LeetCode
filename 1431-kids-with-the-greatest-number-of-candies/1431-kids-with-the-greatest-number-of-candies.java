class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        List<Boolean> l1=new ArrayList<>();
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]+extraCandies>=max) l1.add(true);
            else l1.add(false);
        }
        return l1;
    }
}