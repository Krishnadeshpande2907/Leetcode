class Solution {
    public boolean isAnagram(String s, String t) {
        int[] lookup = new int[26];
        for (char c : s.toCharArray())  lookup[c - 'a']++;
        for (char c : t.toCharArray())  lookup[c - 'a']--;
        for (int i : lookup) {
            if (i != 0) return false;
        }
        return true;
    }
}