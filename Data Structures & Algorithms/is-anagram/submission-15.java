class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.lenght())
        return false;
        HashMap< Character , Integer> count=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(j=0;j<t.length();j++){
            int c=t.charAt(j);
            count.put(c,getOrDefault(c,0)-1);
        
        if(count.get(c)<0)
        return false;
    }
    return true;




    }
}
