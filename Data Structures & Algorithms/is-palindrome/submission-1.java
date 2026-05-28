class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right&&!character.isLetterOrDigit(s.charAt(right)))
            right--;

        }
        if(Character.toLowerCase(s.charAt(left)!=Character.toLowercase(s.charAt(right)){
            return false;
        }
        left--;
        right--;
        
    }
    return true;
}
