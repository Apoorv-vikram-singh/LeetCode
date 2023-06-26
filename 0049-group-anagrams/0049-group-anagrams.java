class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char abc[]=s.toCharArray();
            Arrays.sort(abc);
            //this line of code we are using because we want convert an array into a string.
            String sort=new String(abc);
            if(!map.containsKey(sort))
            {
                map.put(sort,new LinkedList<String>());
            }
            map.get(sort).add(s);
            
        }
        return new LinkedList<>(map.values());
    }
}