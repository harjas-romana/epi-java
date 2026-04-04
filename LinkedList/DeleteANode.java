package LinkedList;

public class DeleteANode {
    
    public static void deleteNode(ListNode<Integer> A) {
        A.data = A.next.data;

        A.next = A.next.next;

    }
}

// Time complexity is O(1)
// Space complexity is O(1)