package b链表;

public class F_160_getIntersectionNode {
    /**
     * 两个链表相交
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        boolean flag = false;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (headA != null) {
            lengthA++;
            headA = headA.next;
        }
        while (headB != null) {
            lengthB++;
            headB = headB.next;
        }
        if (lengthA - lengthB > 0) {
            flag = true;
        }
        int differenceValue = Math.abs(lengthA - lengthB);
        if (flag) {
            while (differenceValue != 0) {
                tempA = tempA.next;
                differenceValue--;
            }
        } else {
            while (differenceValue != 0) {
                tempB = tempB.next;
                differenceValue--;
            }
        }

        while (tempA != null && tempB != null) {
            if(tempA.equals(tempB)){
                return tempA;
            }else {
                tempA = tempA.next;
                tempB = tempB.next;
            }
        }
        return null;
    }
}
