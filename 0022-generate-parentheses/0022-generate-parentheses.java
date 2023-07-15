class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ab=new ArrayList();
        String s="";
        find(ab,n,0,0,s);
        return ab;
            
    }
  public static void find(List<String> ab,int n,int a,int b,String s)
    {
        if(s.length()==n*2)
        {
            ab.add(s);
            return;
        }
        if(a<n)
        {
            find(ab,n,a+1,b,s+"(");
        }
        if(b<a)
        {
            find(ab,n,a,b+1,s+")");
        }
    }
}