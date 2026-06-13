class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(key, k -> new ArrayList<>())
               .add(str);

            //    if (!map.containsKey(key)) {
            //         map.put(key, new ArrayList<>());
            //     }

            //     map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}