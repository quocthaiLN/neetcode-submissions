class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length, res[] = new int[n];
        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            int j = i;
            while (j < n && temperatures[j] <= temperatures[i]) {
                stack.push(temperatures[j]);
                j++;   
            }
            if(j == n)
                continue;
            while(!stack.isEmpty()){
                res[i]++;
                stack.pop();
            }
        }
        return res;
    }
}
