class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> ans=new HashSet<>();
        int left=0,len=0;
       // if(n==1) return 1;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            while(ans.contains(c)){
                ans.remove(s.charAt(left));
                left++;
            }
           ans.add(c);
            len=Math.max(len,i-left+1);
             
        }
        return len;
    }
}
