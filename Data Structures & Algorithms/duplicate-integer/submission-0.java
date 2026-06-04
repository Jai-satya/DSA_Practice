class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> ans=new HashSet<>();
        for(int i:nums){
            if(!ans.contains(i)){
                
                ans.add(i);
            }else
            return true;
        }
        return false;
    }
}