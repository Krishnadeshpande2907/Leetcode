class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        if(len<3){
            for(int n : nums)   set.add(n);
            List<Integer> ans = new ArrayList<>(set);
            return ans;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            int count = map.getOrDefault(n,0);
            count = count+1;
            if(count>len/3){
                set.add(n);
            }
            map.put(n, count);
        }
        List<Integer> ans = new ArrayList<>(set);
        return ans;
    }
}