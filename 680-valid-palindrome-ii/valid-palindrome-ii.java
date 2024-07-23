class Solution {
    public boolean validPalindrome(String s) {
        int maxDelete = 1;
        int front = 0;
        int last = s.length()-1;
        while(front<=last){
            if(s.charAt(front) == s.charAt(last)){
                front++;
                last--;
            }
            else    return isPalindrome(s, front+1, last) || isPalindrome(s, front, last-1);
        }
        return true;
    }

    private boolean isPalindrome(String s, int front, int last){
        while(front<=last){
            if(s.charAt(front) == s.charAt(last)){
                front++;
                last--;
            }
            else    return false;
        }
        return true;
    }
}