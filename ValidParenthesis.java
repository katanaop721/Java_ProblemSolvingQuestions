import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String str="[((}))]";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)==']' || str.charAt(i)=='}' || str.charAt(i)==')'){
                if(stack.peek()=='[' || stack.peek()=='{' || stack.peek()=='('){
                        stack.pop();
                }else{
                    System.out.print("Invalid string");
                }
            }
        }
    }
}
