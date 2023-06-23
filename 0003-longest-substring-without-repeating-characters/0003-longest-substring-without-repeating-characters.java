class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> a=new ArrayList<Character>();
        int maxsum=0;
        int cursum=0;
        int maxsum1=0;
        while(cursum<s.length())
        {
            if(!a.contains(s.charAt(cursum)))
            {
                a.add(s.charAt(cursum));
                cursum++;
                maxsum=Math.max(maxsum,a.size());
            }
            else
            {
                a.remove(Character.valueOf(s.charAt(maxsum1)));
                maxsum1++;
            }
        }
        return maxsum;
        
        
       
    }
}