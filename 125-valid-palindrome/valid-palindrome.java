class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())    return true;
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char charFirst = s.charAt(start);
        	char charLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(charFirst))  start++;
        	else if(!Character.isLetterOrDigit(charLast))   last--;
        	else {
        		if (Character.toLowerCase(charFirst) != Character.toLowerCase(charLast))    return false;
        		start++;
        		last--;
        	}
        }
        return true;
    }
}