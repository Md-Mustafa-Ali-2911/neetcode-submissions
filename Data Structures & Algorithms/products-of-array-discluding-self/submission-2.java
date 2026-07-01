class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] preProd = new int[n];
        int[] postProd = new int[n];

        preProd[0] = 1;
        int prod = nums[0];
        for (int i = 1; i < n; i++) {
            preProd[i] = prod;
            prod*=nums[i];
        }
        // [1, 1, 2, 6]

        postProd[n-1] = 1;
        prod = nums[n-1];

        for (int i = n-2; i >= 0; i--) {
            postProd[i] = prod;
            prod *= nums[i];
        }
        // [24, 12 , 4 ,1]

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = (preProd[i] * postProd[i]);
        }

        return res;
    }
}