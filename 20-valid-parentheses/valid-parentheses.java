class Solution {
    public boolean isValid(String s) {
        Stack<Character> rack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '{' || bracket == '[')  rack.push(bracket);
            else{
                if(rack.isEmpty())  return false;
                char top = rack.peek();
                if((bracket == ')' && top == '(') 
                || (bracket == '}' && top == '{') 
                || (bracket == ']' && top == '['))  rack.pop();
                else    return false;
            }
        }
        return rack.isEmpty();
    }
}