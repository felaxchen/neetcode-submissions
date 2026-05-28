class Solution {

    public String encode(List<String> strs) {
        String result=" ";
        for(int i=0;i<strs.size();i++){
            String word=strs.get(i);
            int length=word.length();
            result=result+length+"#"+word;
        }
        return result;

    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.length()){
                int j=i;
                while(str.charAt(j)!='#'){
                    j++;
                }
                String lengthString=str.subString(i,j);
                int length=Interger.parseInt(lengthString);
                j=j+1;
                String word=str.substring(j,j+length);
                result.add(word);
                i=j+length;
            }
            return result;
        }


    }}
