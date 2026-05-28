import java.util.*;
class Solution{
    public boolean hasDuplicate(int[] nums)
    {
        HashSet <Integer> set=new Hashset<>();
        for(int x:nums){
            if(set.contains(x)){
                System.out.println("true");
            }
             set.add(x);
        }
        System.out.println("false");

    }
}