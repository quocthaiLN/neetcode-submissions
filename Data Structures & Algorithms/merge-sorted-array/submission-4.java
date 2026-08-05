class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length2 = nums2.length;
        for(int i = 0; i < length2 && i < n; i++){
            nums1[m + i] = nums2[i]; 
        }

        Arrays.sort(nums1);
    }
}