class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int s = Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        int i = 1;
        while (i < n) {
            if ("+".equals(tokens[i])) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                s = num1 + num2;
                stack.push(s);
            } else if ("-".equals(tokens[i])) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                s = num1 - num2;
                stack.push(s);
            } else if ("*".equals(tokens[i])) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                s = num1 * num2;
                stack.push(s);
            } else if ("/".equals(tokens[i])) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                s = num1 / num2;
                stack.push(s);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
            i++;
        }
        return s;
    }
}