class Solution {
    public boolean isValid(String sc) {
        int n=sc.length();
        Stack<Character> s=new Stack<>();
        char ch[]=sc.toCharArray();
        for(int i=0;i<sc.length();i++)
        {
            if(ch[i]=='('||ch[i]=='{'||ch[i]=='[')
            {
                s.push(ch[i]);
            }
            else if(ch[i]==')'&& !s.isEmpty() && s.peek()=='(')
            {
                s.pop();
            }
            else if(ch[i]=='}'&& !s.isEmpty() && s.peek()=='{')
            {
                s.pop();
            }
            else if(ch[i]==']'&& !s.isEmpty() && s.peek()=='[')
            {
                s.pop();
            }
            else
            {
                return false;
            }
            
        }
        return s.isEmpty();
    }
}