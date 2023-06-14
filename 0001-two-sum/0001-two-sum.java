class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> a=new HashMap<>();
    int arr[]=new int[2];   
    for(int i=0;i<nums.length;i++) 
    {
        if(!a.containsKey(target-nums[i]))
        {
            a.put(nums[i],i);
        }
        else
        {
            arr[1]=i;
            arr[0]=a.get(target-nums[i]);
            return arr;
        }
    }
    return arr;
    }
}