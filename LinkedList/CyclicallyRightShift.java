package LinkedList;

public class CyclicallyRightShift {
    
    public static ListNode<Integer> cyclicallyRightShiftListNode(ListNode<Integer> A, int k) {

        ListNode<Integer> tail = A;
        int len = 1;
        while(tail.next != null) {
            len++;
            tail = tail.next;
        }

        k = k % len;

        if(k == 0) return A;

        tail.next = A;

        int stepsToTail = len - k - 1;
        ListNode<Integer> newTail = A;

        while(stepsToTail-- > 0) {
            newTail = newTail.next;
        }

        ListNode<Integer> newHead = newTail.next;
        newTail.next = null;

        return newHead;

    }
}
