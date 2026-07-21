class TimeMap {
    HashMap<String, List<Pair<Integer, String>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Pair<Integer, String> pair = new Pair<>(timestamp, value);

        if (map.containsKey(key)) {
            map.get(key).add(pair);
        } else {
            List<Pair<Integer, String>> list = new ArrayList<>();
            list.add(pair);
            map.put(key, list);
        }
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        List<Pair<Integer, String>> list = map.get(key);

        int left = 0, right = list.size() - 1;
        if(list.get(left).getKey() > timestamp){
            return "";
        }

        if(list.get(right).getKey() <= timestamp){
            return list.get(right).getValue();
        }

        String ans = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid).getKey() <= timestamp) {
                ans = list.get(mid).getValue();
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
