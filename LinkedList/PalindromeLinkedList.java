package LinkedList;

public class PalindromeLinkedList {
    
    public static boolean isValidPalindromeLinkedList(ListNode<Integer> A) {

        if(A == null || A.next == null) {
            return true;
        }

        ListNode<Integer> slow = A;
        ListNode<Integer> fast = A;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode<Integer> firstHalfIter = A;
        ListNode<Integer> secondHalfIter = reverseList(slow);

        while(firstHalfIter != null && secondHalfIter != null) {

            if(!firstHalfIter.data.equals(secondHalfIter.data)) {
                return false;
            }
            firstHalfIter = firstHalfIter.next;
            secondHalfIter = secondHalfIter.next;

        }
        return true;
    }
    private static ListNode<Integer> reverseList(ListNode<Integer> L) {
        ListNode<Integer> prev = null;
        ListNode<Integer> current = L;

        while(current != null) {
            ListNode<Integer> nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}

// Time complexity is O(N)
// Space complexity is O(1)