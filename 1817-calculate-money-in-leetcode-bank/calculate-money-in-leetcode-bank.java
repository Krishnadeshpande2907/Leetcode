class Solution {
    public int totalMoney(int n) {
        int fullWeeks = n/7;
        int total = 0;
        for(int i = 1; i<=fullWeeks; i++) {
            total += 7*(i+3);
        }
        for(int i = 7*fullWeeks; i<n; i++){
            total += ++fullWeeks;
        }
        return total;
    }
}