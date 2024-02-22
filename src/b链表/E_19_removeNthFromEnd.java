package b链表;

public class E_19_removeNthFromEnd {
    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head_front = new ListNode(0, head);
        ListNode front = head_front;
        ListNode rear = head_front;
        while (front != null && n > 0) {
            front = front.next;
            n--;
        }
        while (front != null) {
            front = front.next;
            rear = rear.next;
        }
        ListNode temp = rear.next;
        if (rear.next != null) {
            rear.next = rear.next.next;
        } else {
            rear.next = null;
        }


        return head_front.next;
    }
}
