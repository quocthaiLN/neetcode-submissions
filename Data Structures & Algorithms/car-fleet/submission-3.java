class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length, pairs[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push((double) (target - pairs[i][0]) / pairs[i][1]);
        }
        int fleet = 0;
        double maxTime = 0;

        for (int i = 0; i < n; i++) {
            double time = (double) (target - pairs[i][0]) / pairs[i][1];

            if (time > maxTime) {
                fleet++;
                maxTime = time;
            }
        }
        return fleet;
    }
}
