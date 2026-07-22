class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int n = strs.length, i = 0;
        boolean flag = true;
        while (flag) {
            if (i >= strs[0].length())
                return ans;
            char prev = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (i >= strs[j].length())
                    return ans;
                if (strs[j].charAt(i) != prev)
                    return ans;
            }
            ans += strs[0].charAt(i);
            i++;
        }
        return ans;
    }
}