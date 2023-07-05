class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=Integer.MAX_VALUE;
        int max=0;
        for(int a:prices)
        {
            if(a<maxPrice)
            {
                maxPrice=a;
            }
            max=Math.max(a-maxPrice,max);
        }
        return max;
    }
}