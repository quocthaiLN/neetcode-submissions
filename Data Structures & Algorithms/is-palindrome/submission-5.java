class Solution {
    boolean needCheck(char c) {
        if (0 <= c - 'a' && 'z' - c >= 0)
            return true;
        if (0 <= c - 'A' && 'Z' - c >= 0)
            return true;
        if (0 <= c - '0' && '9' - c >= 0)
            return true;
        return false;
    }

    public boolean isPalindrome(String s) {
        int length = s.length(), left = 0, right = length - 1;
        while (left <= right) {
            while (!needCheck(s.charAt(left)) && left < right) {
                left++;
            }

            while (!needCheck(s.charAt(right)) && right > left) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
