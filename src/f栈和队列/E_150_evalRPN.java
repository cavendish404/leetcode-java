package f栈和队列;

import java.util.Stack;

public class E_150_evalRPN {
    /**
     * 给你一个字符串数组 tokens ，表示一个根据 逆波兰表示法 表示的算术表达式。
     * <p>
     * 请你计算该表达式。返回一个表示表达式值的整数。
     * <p>
     * 注意：
     * <p>
     * 有效的算符为 '+'、'-'、'*' 和 '/' 。
     * 每个操作数（运算对象）都可以是一个整数或者另一个表达式。
     * 两个整数之间的除法总是 向零截断 。
     * 表达式中不含除零运算。
     * 输入是一个根据逆波兰表示法表示的算术表达式。
     * 答案及所有中间计算结果可以用 32 位 整数表示。
     *
     * @param tokens
     * @return
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if (tokens[i].equals("+")) {
                    stack.push(num1 + num2);
                } else if (tokens[i].equals("-")) {
                    stack.push(num1 - num2);
                } else if (tokens[i].equals("*")) {
                    stack.push(num1 * num2);
                } else {
                    stack.push(num1 / num2);
                }
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }

}
