class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(nums[i] == ((float) target) / 2){
                    result[0] = map.get(nums[i]);
                    result[1] = i;
                    return result;
                }
                continue;
            }
                
            map.put(nums[i], i);
        }
        for(int i=0; i< nums.length;i++) {
            int num2 = target - nums[i];
            result[0] = i;
            if(!map.containsKey(num2))
                    continue;

            int num2_idx = map.get(num2);
            if(num2_idx == i)
                continue;
            result[1] = num2_idx;
            break;
        }
        return result;
    }
}