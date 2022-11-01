class Solution {
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        String arr[]=s1.split(" ");
        String arr1[]=s2.split(" ");
        List<String> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        HashMap<String, Integer> h1=new HashMap<>();
        HashMap<String, Integer> h2=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr1.length;i++)
        {
            h2.put(arr1[i],h2.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if((!h2.containsKey(arr[i])) && (h1.get(arr[i])==1))
            {
                l2.add(arr[i]);
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            if((!h1.containsKey(arr1[i])) && (h2.get(arr1[i])==1))
            {
                if(!l2.contains(arr1[i])) l2.add(arr1[i]);
            }
        }
        String ans[]=new String[l2.size()];
        for(int i=0;i<l2.size();i++)
        {
            ans[i]=l2.get(i);
        }
        return ans;
        
    }
}