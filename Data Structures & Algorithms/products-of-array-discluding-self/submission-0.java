class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int output[]=new int[len];

        int left = 1;
        for(int i = 0; i < len ; i++)
        {
            output[i] = left;
            left = left * nums[i];
        }

        int right = 1;
        for(int i = len - 1; i >= 0 ;i--)
        {
            output[i]=output[i] * right;
            right = right * nums[i];
        }
        return output;
    }
}  
