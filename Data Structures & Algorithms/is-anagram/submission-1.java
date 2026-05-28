class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s[i]==t[j])
                c++;
            }
            y=t.length();
            if(y==c)
            return true;
            else 
            return false;
        }

    }
}
