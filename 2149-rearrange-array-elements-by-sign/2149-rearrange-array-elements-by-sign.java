class Solution {
    public int[] rearrangeArray(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                count++;
            }
        }
        int pos[]=new int[count];
        int neg[]=new int[nums.length-count];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                pos[a]=nums[i];
                a++;
            }
            else
            {
                neg[b]=nums[i];
                b++;
            }
        }
        int k=0,l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=pos[k];
                k++;
            }
            else
            {
                nums[i]=neg[l];
                l++;
            }
        }
        return nums;
    }
}