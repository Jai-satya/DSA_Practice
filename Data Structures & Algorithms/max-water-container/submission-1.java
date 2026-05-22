class Solution {
    public int maxArea(int[] heights) {
      
        int max=Integer.MIN_VALUE;
        int n=heights.length;
        int l=0,r=n-1;
        while(l<r){
             int res=(r-l)*Math.min(heights[l],heights[r]);
            max=Math.max(max,res);

            if(heights[l]<=heights[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return max;
    }
}
