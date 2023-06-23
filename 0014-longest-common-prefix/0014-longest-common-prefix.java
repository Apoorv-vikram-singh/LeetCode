class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start=strs[0];
        String last=strs[strs.length-1];
        int index=0;
        while(index<start.length())
        {
            if(start.charAt(index)==last.charAt(index))
            {
                index++;
            }
            else 
            {
                break;
            }
        }
        return index>0?start.substring(0,index):"";
    }
}