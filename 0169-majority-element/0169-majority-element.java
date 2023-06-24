class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int ansindex=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[ansindex])
            {
                count++;
            }
            else
            {
                
                count--;
            }
            if(count==0)
            {
                ansindex=i;
                count=1;
            }
        }
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[ansindex]==nums[i])
            {
                n++;
            }
            
        }
        return (nums.length)/2 <n?nums[ansindex]:-1;
    }
}