class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), left = 0, right = 0, max_len = 0;
        char[] char_s = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        while (right < n) {
            while (set.contains(char_s[right])) {
                set.remove(char_s[left]);
                left++;
            }
            set.add(char_s[right]);

            int len = right - left + 1;
            if (len > max_len) {
                max_len = len;
            }
            right++;
        }
        return max_len;
    }
}