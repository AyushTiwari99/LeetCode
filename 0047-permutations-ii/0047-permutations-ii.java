class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
       
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        boolean arr[]=new boolean[nums.length];
        compute(res,l1,arr,nums);
        return res;
    }
    public static void compute(List<List<Integer>> res,List<Integer> l1 , boolean fre[], int nums[])
    {
        if(l1.size()==nums.length) 
        {
            if(!res.contains(l1)){
            res.add(new ArrayList<>(l1));
            return;}
            else
            {
                return;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!fre[i])
            {
                l1.add(nums[i]);
                fre[i]=true;
                compute(res,l1,fre,nums);
                l1.remove(l1.size()-1);
                fre[i]=false;
            }  
        }             
    }
}