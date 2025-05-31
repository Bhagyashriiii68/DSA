class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxProd=nums[0];
        int lToR=1; int rToL=1;

        for(int i=0;i<n;i++)
        {
            lToR=(lToR==0?1:lToR)*nums[i];
            rToL=(rToL==0?1:rToL)*nums[n-i-1];

            maxProd=Math.max(maxProd, Math.max(lToR, rToL));
        }
        return maxProd;
    }
}