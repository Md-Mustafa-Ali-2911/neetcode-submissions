class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int cnt = 0;

        int ProdWZero = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                cnt++;
            } else {
                ProdWZero *= nums[i];
            }
        }

        if (cnt > 1) return new int[n];

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (cnt > 0 && nums[i] != 0) {
                res[i] = 0;
            } else if(cnt == 0 && nums[i] != 0) {
                res[i] = ProdWZero/nums[i];
            } else {
                res[i] = ProdWZero;
            }
        }

        return res;
    }
}