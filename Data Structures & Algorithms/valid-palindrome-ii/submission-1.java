class Solution {
    public boolean validPalindrome(String s) {
        boolean is_deleted = false;
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return (helperValidPalindrome(s, l + 1, r) || helperValidPalindrome(s, l, r - 1));
            }
        }
        return true;
    }

    private boolean helperValidPalindrome(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}