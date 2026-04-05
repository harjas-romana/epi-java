package LinkedList;

public class LinkedListPivoting {
    
    public static ListNode<Integer> listPivoting(ListNode<Integer> A, int k) {

        ListNode<Integer> lessNode = new ListNode<Integer>(0);
        ListNode<Integer> equalNode = new ListNode<Integer>(0);
        ListNode<Integer> greaterNode = new ListNode<Integer>(0);

        ListNode<Integer> lessIter = lessNode;
        ListNode<Integer> equalIter = equalNode;
        ListNode<Integer> greaterIter = greaterNode;

        ListNode<Integer> iterationNode = A;

        while(iterationNode != null) {
            if(iterationNode.data < k) {
                lessIter.next = iterationNode;
                lessIter = iterationNode;
            } else if(iterationNode.data == k) {
                equalIter.next = iterationNode;
                equalIter = iterationNode;
            } else {
                greaterIter.next = iterationNode;
                greaterIter = iterationNode;
            }
            iterationNode = iterationNode.next;
        }

        greaterIter.next = null;
        equalIter.next = greaterNode.next;
        lessIter.next = equalNode.next;

        return lessNode.next;
    }
}

// Time complexity is O(N)
// Space complexity is O(1)