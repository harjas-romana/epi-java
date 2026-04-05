package LinkedList;

public class AddTwoNumbersInLinkedList {
    
    public static ListNode<Integer> addTwoNumbersInLinkedList(ListNode<Integer> A, ListNode<Integer> B) {
        ListNode<Integer> dummy = new ListNode<Integer>(0);
        ListNode<Integer> iter = dummy;

        int carry = 0;

        while(A != null || B != null || carry > 0) {
            
            int sum = carry;

            if(A != null) {
                sum += A.data;
                A = A.next;
            }

            if(B != null) {
                sum += B.data;
                B = B.next;
            }

            iter.next = new ListNode<Integer>(sum % 10);

            carry = sum / 10;

            iter = iter.next;
        }
        return dummy.next;
    }
}

// Time complexity is O(N)
// Space complexity is O(1)