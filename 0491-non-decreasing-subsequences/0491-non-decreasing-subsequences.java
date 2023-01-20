class Solution {
    Set<List<Integer>> ans = new HashSet<>();
    List<Integer> l1= new ArrayList<>();
    public void genrateSubsequences(int[] nums,int idx)
    {
        if(nums.length==idx)
        {
            if(l1.size()>1)
                ans.add(new ArrayList<>(l1));
            return;
        }
        if(l1.size()==0 || l1.get(l1.size()-1)<=nums[idx])
        {
            l1.add(nums[idx]);
            genrateSubsequences(nums,idx+1);
            l1.remove(l1.size()-1);
        }
        genrateSubsequences(nums,idx+1);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        genrateSubsequences(nums,0);
        return new ArrayList(ans);
    }
}