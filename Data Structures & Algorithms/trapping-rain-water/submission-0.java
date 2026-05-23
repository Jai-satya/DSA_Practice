class Solution {
    public int trap(int[] heights) {
        int res=0;
        int n=heights.length;
        if(n==1||n==2) return 0;
        int l=0,r=n-1;
        int leftMax=heights[l];
        int rightMax=heights[r];

        while(l<r){
            if(heights[l]<heights[r]){
                 l++;
                leftMax=Math.max(leftMax,heights[l]);
               
                res+=leftMax-heights[l];
            }
            else{
                r--;
                 rightMax=Math.max(rightMax,heights[r]);
                
                res+=rightMax-heights[r];
            }
        }
       
        return res;
    }
}
