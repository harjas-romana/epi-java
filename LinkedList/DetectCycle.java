package LinkedList;

public class DetectCycle {
    public static boolean containCycle(ListNode<Integer> head) {

        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;


            if(slow == fast) {
                return true;
            }


        }
        return false;
    }
}