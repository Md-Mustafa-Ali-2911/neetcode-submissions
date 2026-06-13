class Solution {
    boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i]) continue;
            
            List<String> str = new ArrayList<>();
            str.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    str.add(strs[j]);
                    visited[j] = true;
                }
            }
            list.add(str);
        }

        return list;
    }
}
