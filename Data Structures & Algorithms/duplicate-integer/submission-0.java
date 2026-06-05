class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
             if(m.containsKey(i)){
                return true;
             }
            m.put(i,i);
           
        }
        return false;
    }
}