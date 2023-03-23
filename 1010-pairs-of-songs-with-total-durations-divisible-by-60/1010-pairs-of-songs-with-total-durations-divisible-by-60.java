class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:time)
        {
            if(i%60==0) count+=map.getOrDefault(0,0);
            else count+=map.getOrDefault(60-i%60,0);
            map.put(i%60,map.getOrDefault(i%60,0)+1);
        }
        return count;
    }
}