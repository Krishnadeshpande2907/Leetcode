class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> greater = new Stack<>();
        HashMap<Integer, Integer> reln = new HashMap<>();

        for(int num : nums2){
            while(!greater.isEmpty() && num > greater.peek())   reln.put(greater.pop(), num);
            greater.push(num);
        }
        
        int i = 0;
        for(int num : nums1) ans[i++] = reln.getOrDefault(num, -1);
        
        return ans;
    }
}