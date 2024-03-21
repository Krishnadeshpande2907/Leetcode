class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i = 0; i<s.length()-2; i++){
            Set<Character> set = new HashSet<Character>();
            for(char c : s.substring(i, i+3).toCharArray()) set.add(c);
            if(set.size()==3)   count++;
        }
        return count;
    }
}