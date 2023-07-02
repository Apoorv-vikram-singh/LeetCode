class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int high=n-1;
        int mid=0;
        int low=0;
        for(int i=0;i<n;i++)
        {
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
                
            }
        }
    }
}