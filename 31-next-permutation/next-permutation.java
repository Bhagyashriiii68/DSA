class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1; //p=pivot
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]) //searching pivot
            {
                p=i;
                break;
            }
        }
        if(p==-1) //last permutation
        {
            reverse(nums,0,n-1);
            return;
        }
        //now swap pivot and just greater element
        for(int i=n-1;i>p;i--) 
        {
            if(nums[i]>nums[p])
            {
                swap(nums,i,p);
                break;
            }
        }
        reverse(nums,p+1,n-1);
    }
    private void swap(int []nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int []nums, int left, int right)
    {
        while(left<right)
        {
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}