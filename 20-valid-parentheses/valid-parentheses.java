class Solution {
    public boolean isValid(String s) {
        Stack<Character> rack = new Stack<Character>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{')   rack.push(bracket);
            else {
                if (rack.isEmpty())    return false;
                char top = rack.peek();
                if ((bracket == ')' && top == '(') || (bracket == ']' && top == '[') || (bracket == '}' && top == '{'))   rack.pop();
                else    return false;
            }
        }
        return rack.isEmpty();
    }
}