class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int i:nums) 
        {
            int key=getNumberTotal(i);
            if (!map.containsKey(key))
            {
                map.put(key, i);
            }
            else 
            {
                result = Math.max(result, map.get(key)+i);
                map.put(key, Math.max(map.get(key), i));
            }
        }
        return result;
    }
    int getNumberTotal(int num) {
        int result = 0;
        while (num!=0) 
        {
            result+= num % 10;
            num/=10;
        }
        return result;
    }
}
