class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];

        int n = numbers.length, left = 0, right = n - 1;

        while(left < right){

            if(numbers[left] + numbers[right] > target){
                right--;
                while(numbers[right] == numbers[right - 1])
                    right--;
            } else if (numbers[left] + numbers[right] < target){
                left++;
                while(numbers[left] == numbers[left + 1])
                    left++;
            } else {
                res[0] = left + 1;
                res[1] = right + 1;
                break;
            }
        }  
        return res;
    }
}