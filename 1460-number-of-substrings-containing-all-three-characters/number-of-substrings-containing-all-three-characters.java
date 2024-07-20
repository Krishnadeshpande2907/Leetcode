class Solution {
    public int numberOfSubstrings(String s) {
        int len = s.length();
        int i = 0, j = 0, count = 0;
        HashMap<Character, Integer> track = new HashMap<>();
        while(j<len){
            char c = s.charAt(j);
            track.put(c, track.getOrDefault(c, 0) + 1);
            while(track.getOrDefault('a', 0) >= 1 
            && track.getOrDefault('b', 0) >= 1 
            && track.getOrDefault('c', 0) >= 1){
                count += len-j;
                c = s.charAt(i);
                track.put(c, track.get(c)-1);
                i++;
            }
            j++;
        }
        return count;
    }
}