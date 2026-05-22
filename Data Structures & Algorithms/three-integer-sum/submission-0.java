class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
