class Solution {

    static boolean isPalindrom(String str){
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) != str.charAt(str.length()-1-i))   return false;
        return true;
    }

    public String firstPalindrome(String[] words) {
        for(String str : words)
            if(isPalindrom(str))    return str;
        return "";
    }
}