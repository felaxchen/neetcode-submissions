class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> an=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(an.containsKey(key)){
            List<String> group=an.get(key);
            group.add(strs[i]);
            }
                       else
                       {
            List<String> group=new ArrayList<>();
            group.add(strs[i]);
            an.put(key,group);
                       }
            


            

        }
        return new ArrayList<>(an.values());
        
    }
}
