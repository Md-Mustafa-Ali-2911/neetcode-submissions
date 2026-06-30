class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[n+1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(entry.getKey());
        }

        int[] res = new int[k];

        int index = 0;

        for (int i = n; i >= 1 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[index++] = num;
                    if (index == k) break;
                }
            }
        }

        return res;
    }
}
