class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length-2; i++){
            // Set<Character> set = new HashSet<Character>();
            // for(char c : s.substring(i, i+3).toCharArray()) set.add(c);
            if(arr[i] != arr[i+1] && arr[i] != arr[i+2] && arr[i+1] != arr[i+2])   count++;
        }
        return count;
    }
}