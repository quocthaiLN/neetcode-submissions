class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> appeared_nums = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(appeared_nums.contains(nums[i]))
                return true;
            appeared_nums.add(nums[i]);
        }
        return false;
    }
}