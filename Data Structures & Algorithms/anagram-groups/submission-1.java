class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] temp_strs = new String[strs.length];
        List<List<String>> result = new ArrayList<List<String>>();

        for (int i = 0; i < strs.length; i++) {
            char[] temp_chars = strs[i].toCharArray();
            Arrays.sort(temp_chars);

            temp_strs[i] = new String(temp_chars);
        }

        HashMap<String, Integer> set = new HashMap<String, Integer>();

        int iterator = 0;

        for (int i = 0; i < temp_strs.length; i++) {
            if (!set.containsKey(temp_strs[i])) {
                set.put(temp_strs[i], iterator);

                result.add(new ArrayList<String>());

                result.get(iterator).add(strs[i]);

                iterator++;
            } else {
                result.get(set.get(temp_strs[i])).add(strs[i]);
            }
        }

        return result;
    }
}