class Solution {
    public boolean isValid(String s) {
            Deque<Character> stack=new ArrayDeque<>();
        //code can be reduced into 3 lines by using hashmap instead of manually writing the code for opening and closing
        if(s.length()==1) return false;
        HashMap<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(char c:s.toCharArray()){
         if(map.containsKey(c)){
         if(!stack.isEmpty()&& stack.peek()==map.get(c)){
            stack.pop();
         }
         else{
            return false;
         }
         }else{
            stack.push(c);
         }
   
    }
    return stack.isEmpty();
}
}
