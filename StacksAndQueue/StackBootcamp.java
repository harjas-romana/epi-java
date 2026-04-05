package StacksAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class StackBootcamp {

    // Definition for a singly-linked list node (required for the method to compile)
    public static class ListNode<T> {
        public T data;
        public ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Prints the entries of a singly-linked list in reverse order using a Stack (Deque).
     * Time Complexity: O(n), where n is the number of nodes in the list.
     * Space Complexity: O(n) to store the nodes in the stack.
     *
     * @param head The head of the linked list.
     */
    public static void printLinkedListInReverse(ListNode<Integer> head) {
        // The preferred way to represent stacks in Java is via the Deque interface.
        Deque<Integer> nodes = new LinkedList<>();

        // Traverse the linked list and push elements onto the stack
        while (head != null) {
            nodes.addFirst(head.data); // push operation
            head = head.next;
        }

        // Pop elements from the stack to print in reverse order
        while (!nodes.isEmpty()) {
            System.out.println(nodes.poll()); // pop operation
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a test linked list: 1 -> 2 -> 3
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        ListNode<Integer> node3 = new ListNode<>(3);
        
        node1.next = node2;
        node2.next = node3;

        System.out.println("Printing list in reverse order:");
        // Expected output:
        // 3
        // 2
        // 1
        printLinkedListInReverse(node1);
    }
}