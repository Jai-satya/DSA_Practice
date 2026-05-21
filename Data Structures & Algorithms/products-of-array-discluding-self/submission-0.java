class Solution {
    public int[] productExceptSelf(int[] nums) {
        //by count of zeros it is possible to do zero count>2 everything will be 0
        //zerocount==1 return array with keeping only product of that else keep all product values

        //using prefix and suffix array
        int n=nums.length;
        int res[]=new int[n];
        int pre[]=new int[n];
        int suffix[]=new int[n];
        pre[0]=1;suffix[n-1]=1;
        for(int i=1;i<n;i++){
            pre[i]=nums[i-1]*pre[i-1];
        }
        for(int j=n-2;j>=0;j--){
            suffix[j]=nums[j+1]*suffix[j+1];
        }
        for(int i=0;i<n;i++){
            res[i]=pre[i]*suffix[i];
        }
        return res;
    }
}  
