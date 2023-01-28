class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==0) return new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List> h=new HashSet<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    List<Integer> ans=new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                   
                    h.add(new ArrayList<>(ans));
                    
                    j++;
                    k--;
                    
                }
                else if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                    k--;
            }
        }
        // list.addAll(h);
        for(List<Integer> i : h){
            list.add(i);
        }
        return list;
        
    }
}