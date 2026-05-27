class Solution {
    int findMin(int num1, int num2) {
        if (num1 < num2)
            return num1;
        return num2;
    }

    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, max = 0;

        while (left < right) {
            int current = (right - left) * findMin(heights[right], heights[left]);
            if(current > max )
                max = current;

            if(heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
