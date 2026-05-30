class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
           String token=tokens[i];
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                stack.push(token);
                System.out.println(token);
            }else{
                int val2;
                int val1;
                if(token.equals("+")){
                    val2=Integer.parseInt(stack.pop());
                    val1=Integer.parseInt(stack.pop());
                    int ans=val1+val2;
                   // System.out.println(ans);
                    stack.push(Integer.toString(ans));
                    // System.out.println(stack.peek());
                }
                else if(token.equals("-")){
                    val2=Integer.parseInt(stack.pop());
                    val1=Integer.parseInt(stack.pop());
                    int ans=val1-val2;
                   // System.out.println(ans);
                    stack.push(Integer.toString(ans));
                    // System.out.println(stack.peek());
                }
                else if(token.equals("*")){
                    val2=Integer.parseInt(stack.pop());
                    val1=Integer.parseInt(stack.pop());
                    int ans=val1*val2;
                  //  System.out.println(ans);
                    stack.push(Integer.toString(ans));
                    // System.out.println(stack.peek());
                }
                else{
                     val2=Integer.parseInt(stack.pop());
                    val1=Integer.parseInt(stack.pop());
                    int ans=(int)val1/val2;
                    //System.out.println(ans);
                    stack.push(Integer.toString(ans));
                     //System.out.println(stack.peek());
                }


            }

        }
        return Integer.parseInt(stack.peek());
    }
}
