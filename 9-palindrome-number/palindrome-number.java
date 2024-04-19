class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        StringBuilder ori = new StringBuilder();
        ori.append(x);
        StringBuilder rev = new StringBuilder(ori.reverse());
        if(rev.toString().equals(Integer.toString(x)))   return true;
        else    return false;
    }
}