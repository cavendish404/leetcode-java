package b链表;

public class C_206_reverseList {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode new_head = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return new_head;
    }

}


