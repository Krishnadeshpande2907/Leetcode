class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            if(word.equals(reversedWord.toString()))    return word;
        }
        return "";
    }
}