class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> answer =new ArrayList<List<Integer>>();
        List<Integer>result=new ArrayList<>();
        find(answer,result,0,nums,n);
        return answer;
    }
    public static void find(List<List<Integer>> answer,List<Integer> result,int first,int[] nums,int n)
    {
        if(first>=n)
        {
            answer.add(new ArrayList<>(result));
            return;
        }
        result.add(nums[first]);
        find(answer,result,first+1,nums,n);
        result.remove(result.size()-1);
        find(answer,result,first+1,nums,n);
        
    }
   
}