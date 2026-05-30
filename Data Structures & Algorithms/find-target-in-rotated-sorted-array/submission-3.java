class Solution {
    private int binarySearch(int[] nums, int target, int left, int right) {
        int inner_left = left, inner_right = right;
        while (inner_left <= inner_right) {
            int inner_mid = inner_left + (inner_right - inner_left) / 2;
            if (nums[inner_mid] == target) {
                return inner_mid;
            } else if (nums[inner_mid] > target) {
                inner_right = inner_mid - 1;
            } else {
                inner_left = inner_mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length, left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;

            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] >= target) {
                    return binarySearch(nums, target, left, mid);
                }
                left = mid + 1;

            } else if (nums[right] >= nums[mid]) {
                if (nums[mid] <= target && nums[right] >= target) {
                    return binarySearch(nums, target, mid, right);
                }
                right = mid - 1;
            }
        }
        return -1;
    }
}