class Solution {
    public int totalMoney(int n) {
        int m = n/7;
        int total = 0;
        for(int i = 1; i<=m; i++){
            total += 7*(i+3);
        }
        for(int i = 7*m; i<n; i++){
            total += ++m;
        }
        return total;
    }
}