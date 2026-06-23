class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min_index]) {
                    min_index = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp;
        }

        return nums;
    }
}