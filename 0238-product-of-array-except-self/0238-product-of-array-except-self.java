class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=count;
            count*=nums[i];
        }
        count=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]=arr[i]*count;
            count=count*nums[i];
        }
        return arr;
    }
}