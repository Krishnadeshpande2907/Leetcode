class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int size = nums.size();
        int count = 0;
        int i = 0;
        // for(int i = 0; i<size-1; i++){
        while(i<size){
            int num1 = nums.get(i);
            for(int j = i+1; j<size; j++){
                if(num1 + nums.get(j) < target)  count++;
                else    break;
            }
            i++;
        }
        return count;
    }
}