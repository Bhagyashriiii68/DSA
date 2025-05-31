class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        int curMaxSum=0, maxSum=nums[0];
        int curMinSum=0, minSum=nums[0];

        for(int i=0;i<n;i++)
        {
            curMaxSum=Math.max(curMaxSum + nums[i], nums[i]);
            maxSum=Math.max(maxSum, curMaxSum);

            curMinSum=Math.min(curMinSum + nums[i], nums[i]);
            minSum=Math.min(minSum, curMinSum);

            totalSum+=nums[i];
        }
        int normalSum=maxSum;
        int circularSum=totalSum-minSum;

        if(totalSum==minSum)
            return normalSum;
        return Math.max(normalSum, circularSum);
    }
}