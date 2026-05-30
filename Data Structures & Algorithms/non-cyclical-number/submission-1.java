class Solution {
    private int calculate(int num) {
        int sum = 0;
        while (num > 0) {
            sum += ((num % 10) * (num % 10));
            num /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int result = n;
        while (result != 1) {
            result = calculate(result);
            if (set.contains(result)) {
                return false;
            }
            set.add(result);
        }

        return true;
    }
}
