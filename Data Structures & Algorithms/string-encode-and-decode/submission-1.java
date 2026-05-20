class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s1:strs){
            int x=s1.length();
            sb.append(x).append("#").append(s1);

        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> s1=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
          int length=Integer.parseInt(str.substring(i,j));
          i=j+1;
          j=i+length;
          s1.add(str.substring(i,j));
          i=j;
        }
        return s1;
    }
    }

