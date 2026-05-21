class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        if (n==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            set.add(nums[i]);
        }
        int res=1,len=1;
        for(int i:nums){
            int test=i-1;
            len=1;
            while(set.contains(test) && test>=min){
                len++;
                test--;
            }
            res=Math.max(res,len);
        }
        return res;

    }
}
