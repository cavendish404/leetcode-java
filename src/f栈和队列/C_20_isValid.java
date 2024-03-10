package f栈和队列;

import java.util.Stack;

public class C_20_isValid {
    public boolean isValid(String s) {
        char[] cs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cs.length; i++) {
            if(cs[i] == '(' || cs[i] == '['|| cs[i] == '{'){
                stack.push(cs[i]);
            }
            if(cs[i] == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return false;
                }else {
                    stack.pop();
                }
            }
            if(cs[i] == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return false;
                }else {
                    stack.pop();
                }
            }
            if(cs[i] == '}'){
                if(stack.empty() || stack.peek() != '{'){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return true;
        }else {
            return false;
        }

    }
}
