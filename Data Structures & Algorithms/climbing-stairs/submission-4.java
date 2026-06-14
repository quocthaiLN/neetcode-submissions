class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return helperClimbStairs(n, map);
    }

    private int helperClimbStairs(int n, HashMap<Integer, Integer> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int num1 = n - 1, num2 = n - 2;
        if (num1 == 0) {
            return 1;
        } else if (num2 == 0) {
            return 2;
        }
        int res = helperClimbStairs(num1, map) + helperClimbStairs(num2, map);
        map.put(n, res);
        return res;
    }
}