class Solution {
    void mergeSort(int nums[], int left, int right) {
        if (left >= right)
            return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        int temp_arr[] = new int[right - left + 1], k = 0;
        int i = left, j = mid + 1;
        while (i <= mid && j <= right) {
            if(nums[i] < nums[j]){
                temp_arr[k] = nums[i];
                k++;
                i++;
            } else {
                temp_arr[k] = nums[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            temp_arr[k] = nums[i];
            k++;
            i++;
        }

        while (j <= right) {
            temp_arr[k] = nums[j];
            j++;
            k++;
        }

        System.arraycopy(temp_arr, 0, nums, left, right - left + 1);
    }

    public int[] sortArray(int[] nums) {
        int right = nums.length - 1, left = 0;
        mergeSort(nums, left, right);
        return nums;
    }
}