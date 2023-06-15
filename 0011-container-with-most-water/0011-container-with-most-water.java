class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxi=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<height.length-1;i++)
        {
            if(height[low]<height[high])
            {
                count=high-low;
                maxi=Math.max(maxi,count*height[low]);
                low++;
            }
            else
            {
                count=high-low;
                maxi=Math.max(maxi,count*height[high]);
                high--;
            }
        }
        return maxi;
    }
}