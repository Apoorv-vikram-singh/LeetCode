class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pr=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pr.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++)
        {
            int a= pr.peek();
            if(nums[i]>a)
            {
                pr.remove();
                pr.add(nums[i]);
            }
            
        }
        return pr.peek();
    }
}