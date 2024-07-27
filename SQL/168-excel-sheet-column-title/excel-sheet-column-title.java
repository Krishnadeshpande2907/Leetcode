class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char ch = (char)('A' + (columnNumber%26));
            ans.append(ch);
            columnNumber /= 26;
        }
        ans.reverse();
        return ans.toString();
    }
}