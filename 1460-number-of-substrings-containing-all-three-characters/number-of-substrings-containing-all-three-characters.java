class Solution {
    public int numberOfSubstrings(String s) {
        int len = s.length();
        int i = 0, j = 0, count = 0;
        HashMap<Character, Integer> track = new HashMap<>();
        while(j<len){
            track.put(s.charAt(j), track.getOrDefault(s.charAt(j), 0) + 1);
            while(track.getOrDefault('a', 0) >= 1 
            && track.getOrDefault('b', 0) >= 1 
            && track.getOrDefault('c', 0) >= 1){
                count += len-j;
                track.put(s.charAt(i), track.get(s.charAt(i))-1);
                i++;
            }
            j++;
        }
        return count;
    }
}