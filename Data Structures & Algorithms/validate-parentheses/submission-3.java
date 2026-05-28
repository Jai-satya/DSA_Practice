class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        //code can be reduced into 3 lines by using hashmap instead of manually writing the code for opening and closing
        if(s.length()==1) return false;
        for(char c:s.toCharArray()){
           
            if(c=='}'||c==']'||c==')'){
            if(!stack.isEmpty()){
             if(c==')' && stack.peek()=='('){
                stack.pop();
             }
             else if(c=='}' && stack.peek()=='{'){
                stack.pop();
             }
             else if(c==']' && stack.peek()=='['){
                stack.pop();
             }
             else return false;
            }
            else return false;
            }
             else
                stack.push(c);
                
            
            
        }
        
    return stack.isEmpty()?true:false;

    }
}
