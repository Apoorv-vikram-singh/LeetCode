class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> a=new ArrayList<Integer>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        find(a,result,0,target,candidates);
        return result;
    }
    public static void find(List<Integer>a,List<List<Integer>>result,int indx,int target,int[] arr)
    {
        if(indx==arr.length)
        {
            if(target==0)
            {
                result.add(new ArrayList<>(a));
            }
            return;
        }
        if(target>=arr[indx])
        {
            a.add(arr[indx]);
            find(a,result,indx,target-arr[indx],arr);
            a.remove(a.size()-1);
        }
        find(a,result,indx+1,target,arr);
    }
}