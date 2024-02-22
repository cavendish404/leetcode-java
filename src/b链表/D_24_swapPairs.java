package b链表;

import java.util.Stack;

public class D_24_swapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = new ListNode(-1);
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        head = p;
        while (cur != null && cur.next != null) {
            stack.push(cur);
            stack.push(cur.next);
            cur = cur.next.next;
            p.next = stack.pop();
            p = p.next;
            p.next = stack.pop();
            p = p.next;
        }
        if(cur != null){
            p.next = cur;
        }else{
            p.next = null;
        }
        return head.next;

    }
}
