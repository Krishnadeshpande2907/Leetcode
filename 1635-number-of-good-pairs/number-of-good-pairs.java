class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int goodNum = 0;
        for(int n : nums){
            int count = map.getOrDefault(n, 0);
            goodNum+=count;
            map.put(n, ++count);
        }
        return goodNum;
    }
}