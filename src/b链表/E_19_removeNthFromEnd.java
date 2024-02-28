package b链表;

public class E_19_removeNthFromEnd {
    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp_head = new ListNode();
        temp_head.next = head;

        ListNode fast = head;
        ListNode slow = temp_head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return temp_head.next;
    }
}
