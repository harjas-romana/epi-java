package LinkedList;

public class DetectCycleTwo {
    
    public static ListNode<Integer> containCycleTwo(ListNode<Integer> head) {

        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {

                ListNode<Integer> temp = head;

                while(temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }

                return temp.next;

            }

        }
        return null;
    }
}
