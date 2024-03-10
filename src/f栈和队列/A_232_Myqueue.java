package f栈和队列;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;
import java.util.List;
import java.util.Stack;

public class A_232_Myqueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public A_232_Myqueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        while(!s1.empty()){
            Integer pop = s1.pop();
            s2.push(pop);
        }
        Integer result = s2.pop();
        while(!s2.empty()){
            Integer pop = s2.pop();
            s1.push(pop);
        }
        return result;
    }

    public int peek() {
        while(!s1.empty()){
            Integer pop = s1.pop();
            s2.push(pop);
        }
        Integer result = s2.peek();
        while(!s2.empty()){
            Integer pop = s2.pop();
            s1.push(pop);
        }
        return result;
    }

    public boolean empty() {
        if(s1.empty() && s2.empty()) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
