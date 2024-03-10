package f栈和队列;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class B_225_MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public B_225_MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty()){
            Integer poll = q1.poll();
            q2.offer(poll);
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
