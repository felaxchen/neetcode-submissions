class Solution {

    public String encode(List<String> strs) {
             StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            int c=strs.get(i).length();
       
            sb.append(c);
            sb.append("#");
            sb.append(strs.get(i));

            
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        int i=0;
        List<String> result=new ArrayList<>();
        while(i<str.length()){
        int j=str.indexOf('#',i);
        int len=Integer.parseInt(str.substring(i,j));
        result.add(str.substring(j+1,j+1+len));
        i=j+1+len;
        }
    
        return result;
    }
        
}

    

