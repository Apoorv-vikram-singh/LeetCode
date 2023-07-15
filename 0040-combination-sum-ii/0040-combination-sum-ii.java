class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        Arrays.sort(candidates);
        find(answer,result,candidates,target,0);
        return answer;
    }
    public static void find(List<List<Integer>> answer,List<Integer> result,int[] arr,int target,int indx)
    {
        if(target==0)
        {
            answer.add(new ArrayList<>(result));
            return;
        }
        for(int i=indx;i<arr.length;i++)
        {
            if(i>indx && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
            
            result.add(arr[i]);
            find(answer,result,arr,target-arr[i],i+1);
            result.remove(result.size()-1);
            
        }
    }
}