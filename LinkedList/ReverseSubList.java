package LinkedList;

public class ReverseSubList {
    
    public static ListNode<Integer> reverseSubListCode(ListNode<Integer> L, int start, int finish) {

        if(start == finish) {
            return L;
        }

        ListNode<Integer> dummyHead = new ListNode<Integer>(0);
        ListNode<Integer> subList = dummyHead;

        int k = 1;
        while(k++ < start) {
            subList = subList.next;
        }

        ListNode<Integer> subIter = subList.next;

        while(start++ < finish) {
            ListNode<Integer> temp = subIter.next;
            subIter.next = temp.next;
            temp.next = subList.next;
            subList.next = temp;
        }
        return dummyHead.next;
    }
}
