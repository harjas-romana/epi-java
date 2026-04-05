package LinkedList;

public class EvenOddMerge {
    
    public static ListNode<Integer> evenOddMergeCode(ListNode<Integer> A) {

        if(A == null || A.next == null) {
            return A;
        }

        ListNode<Integer> even = A;
        ListNode<Integer> odd = A.next;

        ListNode<Integer> oddHead = odd;

        while(odd != null && odd.next != null) {

            even.next = odd.next;
            even = even.next;

            odd.next = even.next;
            odd = odd.next;

        }

        even.next = oddHead;

        return A;
    }
}

// Time complexity is O(N)
// Space complexity is O(1)