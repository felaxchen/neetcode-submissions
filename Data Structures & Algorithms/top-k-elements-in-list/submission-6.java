class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            count.put(c,count.getOrDefault(c,0)+1);
            
            
            
        }
        List<Integer> list=new ArrayList<>(count.keySet());
            Collections.sort(list,(a,b)->count.get(b)-count.get(a));
            int[] result=new int[k];
            for(int i=0;i<k;i++){
                result[i]=list.get(i);
            }
            return result;
            
        
    }
}
