package LinkedList;

public class RemoveDuplicatesFromSortedListNode {
    
    public static ListNode<Integer> removeDuplicates(ListNode<Integer> A) {

        ListNode<Integer> L = A;

        while(L != null) {

            if(L.data.equals(L.next.data)) {
                L.next = L.next.next;
            } else {
                L = L.next;
            }
        }
        return A;
    }
}
// Time complexity is O(N)
// Space complexity is O(1)