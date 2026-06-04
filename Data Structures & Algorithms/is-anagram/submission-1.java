class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> s1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            s1.put(c,s1.getOrDefault(c,0)+1);
        }
        for(int j=0;j<t.length();j++){
            char c=t.charAt(j);
            s1.put(c,s1.getOrDefault(c,0)-1);
        }
        for(Map.Entry<Character,Integer> t1:s1.entrySet()){
            Integer values=t1.getValue();
            if(values!=0){
                return false;
            }
        }
        return true;
    }
}
