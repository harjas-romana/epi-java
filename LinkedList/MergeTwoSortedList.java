package LinkedList;


public class MergeTwoSortedList {
    
    public static ListNode<Integer> mergeTwoLists(ListNode<Integer> L1, ListNode<Integer> L2) {

        ListNode<Integer> dummy = new ListNode<Integer>(0);
        ListNode<Integer> current = dummy;

        while(L1 != null && L2 != null) {

            if(L1.data < L2.data) {
                current.next = L1;
                L1 = L1.next;
            } else {
                current.next = L2;
                L2 = L2.next;
            }
            current = current.next;
        }
        return dummy.next;
    }
}

// Time complexity is O(N+M)
// Space complexity is O(1)