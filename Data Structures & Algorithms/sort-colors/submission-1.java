class Solution {
    public void sortColors(int[] nums) {
        int cntZero = 0;
        int cntOne = 0;
        int cntTwo = 0;

        for (int num : nums) {
            if (num == 0) cntZero++;
            else if (num == 1) cntOne++;
            else if (num == 2) cntTwo++;
        }

        int index = 0;

        while (cntZero > 0) {
            nums[index++] = 0;
            cntZero--;
        }

        while (cntOne > 0) {
            nums[index++] = 1;
            cntOne--;
        }

        while (cntTwo > 0) {
            nums[index++] = 2;
            cntTwo--;
        }
    }
}