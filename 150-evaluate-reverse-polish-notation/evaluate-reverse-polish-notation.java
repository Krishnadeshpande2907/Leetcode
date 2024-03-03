class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<Integer>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(operation(num1, num2, token));
            }
            else{
                nums.push(Integer.parseInt(token));
            }
        }
        return nums.peek();
    }
    public int operation(int x, int y, String op){
        switch(op){
            case "+":
                return y+x;
            case "-":
                return y-x;
            case "*":
                return y*x;
            case "/":
                return y/x;
        }
        return -1;
    }
}