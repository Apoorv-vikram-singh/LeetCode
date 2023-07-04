class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return true;
        }
        int max=0;
        for(int i=0;i<n&& max>=i;i++)
        {
            if(max>=n-1)
            {
                return true;
            }
            if(i+nums[i]>max)
            {
                max=i+nums[i];
            }
        }
        return false;
        
    }
}