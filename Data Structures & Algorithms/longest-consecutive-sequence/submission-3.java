class Solution {
    public int longestConsecutive(int[] nums) {
          int n=nums.length;
          //optimal
        int min=Integer.MAX_VALUE;
        if (n==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int res=1;
        for(int i:nums){

            if(!set.contains(i-1)){//no left neighbour so start of sequence

                int curr=i;
                int len=1;
                while(set.contains(curr+1)){
                    len++;
                    curr++;
                }
                res=Math.max(res,len);
            }
        }
        return res;

    }
}
