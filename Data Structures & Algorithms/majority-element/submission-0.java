class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int ele = nums[i];
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == ele) {
                    cnt++;
                }
            }

            if (cnt > n/2) {
                return ele;
            }
        }

        return -1;
    }
}