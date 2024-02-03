class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int size = nums.size();
        int count = 0;
        for(int i = 0; i<size-1; i++){
            int num1 = nums.get(i);
            for(int j = i+1; j<size; j++){
                if(num1 + nums.get(j) < target)  count++;
                else    j = size;
            }
        }
        return count;
    }
}