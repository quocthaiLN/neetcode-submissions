class MinStack {
    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();
    int min;

    public MinStack() {}

    public void push(int val) {
        if (stack.isEmpty() || (!stack.isEmpty() && val < min))
            min = val;
        stack.push(val);
        minStack.push(val);
        minStack.push(min);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
        minStack.pop();
        if (!minStack.isEmpty()) {
            min = minStack.peek();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
