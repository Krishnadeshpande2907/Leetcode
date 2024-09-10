class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        int len = s.length();
        if(s == null || len<10)   return ans;
        Set<String> ansSet = new HashSet<String>();
        Set<String> set = new HashSet<String>();
        for(int i = 0; i<=len-10; i++){
            String sub = s.substring(i, i+10);
            if(!set.add(sub))   ansSet.add(sub);
        }
        ans.addAll(ansSet);
        return ans;
    }
}