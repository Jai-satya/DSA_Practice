class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length()-1;
       
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
      
        String str=sb.toString();
        String str2=str.toLowerCase();
        if(str2.length() <= 0) return true;
         int left=0,right=str2.length()-1;
         
        for(int i=0;i<=str2.length()/2;i++){
            if(str2.charAt(left)!=str2.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
