class Solution {
    private boolean check(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char temp = stack.pop();

                if (!check(temp, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}