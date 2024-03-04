class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int len = temp.length;
        int[] ans = new int[len];
        Stack<Integer> days = new Stack<Integer>();
        for(int i = 0; i<len; i++){
            while(!days.isEmpty() && temp[days.peek()]<temp[i]){
                ans[days.peek()] = i-days.pop();
            }
            days.push(i);
        }
        return ans;
    }
}