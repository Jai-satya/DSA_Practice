class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> ans=new HashMap<>();
        int l=0,maxf=0,res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            ans.put(c,ans.getOrDefault(c,0)+1);
            maxf=Math.max(maxf,ans.get(c));
            while((i-l+1)-maxf>k){
                ans.put(s.charAt(l),ans.getOrDefault(s.charAt(l), 0)-1);
                l++;
            }
            res=Math.max(res,i-l+1);
        }
        return res;

    }
}
