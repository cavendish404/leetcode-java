package b链表;

public class A_203_removeElements {
    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode p = head;
        ListNode q = temp;
        while(p != null){
            if(p.val == val){
                q.next = p.next;
                p = q.next;
            }else {
                p = p.next;
                q = q.next;
            }
        }

        return temp.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
