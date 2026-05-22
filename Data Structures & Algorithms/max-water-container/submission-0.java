class Solution {
    public int maxArea(int[] heights) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=heights.length;
        int l=0,r=n-1;
        while(l<r){
            if(heights[l]<=heights[r]){
                int res=heights[l]*(r-l);
                max=Math.max(max,res);
                l++;
            }
            else{
                 int res=heights[r]*(r-l);
                max=Math.max(max,res);
                r--;
            }

        }
        return max;
    }
}
