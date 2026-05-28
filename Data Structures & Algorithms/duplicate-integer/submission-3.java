class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums)l;
        for(int i=0;i<=nums.length;i++){
             if(nums[i]=nums[i+1]){
                return true;
             }
        }
        return false;
        
    }
}