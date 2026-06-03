class Solution {
    public int[] productExceptSelf(int[] nums) {
           int[] t=new int[nums.length];
           
        for(int i=0;i<nums.length;i++){
             int pro=1;
        for(int j=0;j<nums.length;j++)
        {
           
                 if(i==j)
                continue;
                pro=pro*nums[j];
            


            }
            t[i]=pro;
        }
        return t;
    }
}