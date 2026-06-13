class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int sumReq = 0;

        for (int i = 0; i < n-1; i++) {
            sumReq = target - nums[i];

            for (int j = i + 1; j < n; j++) {
                if (nums[j] == sumReq) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
