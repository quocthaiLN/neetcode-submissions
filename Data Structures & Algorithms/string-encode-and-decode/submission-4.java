class Solution {
    public String encode(List<String> strs) {
        // String e = "";
        // for (int i = 0; i < strs.size(); i++) {
        //     String len_str_i = String.valueOf(strs.get(i).length());
        //     e += (len_str_i + '#' + strs.get(i));
        // }
        // return e;

        // Dùng StringBuilder -> Không tạo String mới rồi copy qua mỗi lần thay đổi
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length())
              .append('#')
              .append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        char[] charArr = str.toCharArray();
        List<String> d = new ArrayList<String>();
        int pointer = 0;
        while (pointer < charArr.length) {
            int start = pointer;
            while (charArr[pointer] != '#') {
                pointer++;
            }
            int len_str_i = Integer.parseInt(str.substring(start, pointer));
            pointer++;
            char[] char_str = new char[len_str_i];
            for (int i = 0; i < len_str_i; i++) {
                char_str[i] = charArr[i + pointer];
            }
            d.add(new String(char_str));
            pointer += len_str_i;
        }
        return d;
    }
}
