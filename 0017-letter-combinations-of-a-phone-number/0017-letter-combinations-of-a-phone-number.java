class Solution {
        ArrayList<String> l1=new ArrayList<>();        
        HashMap<String,String> hash=new HashMap<>();
        {{
        hash.put("2","abc");
        hash.put("3","def");
        hash.put("4","ghi");
        hash.put("5","jkl");
        hash.put("6","mno");
        hash.put("7","pqrs");
        hash.put("8","tuv");
        hash.put("9","wxyz");
        }}
    public void backtrack(String combination, String digit)
        {
            if(digit.length()==0)
            {
                l1.add(combination);
            }
            else
            {
                String dig=digit.substring(0,1);
                String letters=hash.get(dig);
                for(int i=0;i<letters.length(); i++)
                {
                    String letter=letters.substring(i, i+1);
                    backtrack(combination +letter,digit.substring(1));
                }
            }
        }
    public List<String> letterCombinations(String digits) 
    {
       if(digits.length()==0) return new ArrayList<>();
        
        if(digits.length()!=0)
        {
            backtrack("",digits);
        }
        return l1; 
    }
}