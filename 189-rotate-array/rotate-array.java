class Solution {
    private static void reverse(int []nums, int start, int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        //step1:reverse the whole arr
        reverse(nums,0,n-1);
        //step2:reverse the first k elements;
        reverse(nums,0,k-1);
        //step3:reverse the remaining n-k elements
        reverse(nums,k,n-1);
        
    }
}