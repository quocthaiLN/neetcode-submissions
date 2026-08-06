class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length(), length2 = word2.length();
        int i = 0, j = 0;
        String res = "";
        while (i < length1 && j < length2) {
            res += word1.charAt(i);
            i++;
            res += word2.charAt(j);
            j++;
        }

        while (i < length1) {
            res += word1.charAt(i);
            i++;
        }

        while (j < length2) {
            res += word2.charAt(j);
            j++;
        }
        return res;
    }
}