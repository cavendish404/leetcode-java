package b链表;

public class G_142_detectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                slow = head;
                while(slow != fast){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
            return null;
    }
}
