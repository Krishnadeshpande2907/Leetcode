class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length(); i>0; i--){
            if(num.charAt(i-1)%2==1)  return num.substring(0,i);
        }
        return "";
    }
}