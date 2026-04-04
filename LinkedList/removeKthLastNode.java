package LinkedList;

public class removeKthLastNode {
    
    public static ListNode<Integer> removeKthLastListNode(ListNode<Integer> L, int k) {

        ListNode<Integer> dummyHead = new ListNode<Integer>(0);
        dummyHead.next = L;

        ListNode<Integer> first = dummyHead.next;

        while(k-- > 0) {
            first = first.next;
        }

        ListNode<Integer> second = dummyHead;

        while(first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummyHead.next;

    }
}
//Time complexity is O(N)
//Space complexity is O(1)