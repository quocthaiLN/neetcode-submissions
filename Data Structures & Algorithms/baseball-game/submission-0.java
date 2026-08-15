class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length, sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (operations[i].equals("+")) {
                int val1 = stack.pop(), val2 = stack.pop();
                sum += (val1 + val2);
                stack.push(val2);
                stack.push(val1);
                stack.push(val1 + val2);
            } else if (operations[i].equals("D")) {
                int val = stack.peek();
                sum += val * 2;
                stack.push(val * 2);
            } else if (operations[i].equals("C")) {
                int val = stack.pop();
                sum -= val;
            } else {
                int val = Integer.parseInt(operations[i]);
                stack.push(val);
                sum += val;
            }
        }
        return sum;
    }
}