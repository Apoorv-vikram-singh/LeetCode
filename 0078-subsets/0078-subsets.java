class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> answer=new ArrayList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        find(answer,result,nums,0);
        return result;
    }
    public static void find(List<Integer>answer,List<List<Integer>> result,int[] nums,int i)
    {
        if(i==nums.length)
        {
            result.add(new ArrayList<>(answer));
            return;
        }
        answer.add(nums[i]);
        find(answer,result,nums,i+1);
        answer.remove(answer.size()-1);
        find(answer,result,nums,i+1);
        
    }
}