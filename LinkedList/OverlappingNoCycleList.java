package LinkedList;

public class OverlappingNoCycleList {
    
    public static ListNode<Integer> overlapNoCycleListCode(ListNode<Integer> L1, ListNode<Integer> L2) {

        int lenOfL1 = 0;
        int lenOfL2 = 0;

        ListNode<Integer> P1 = L1;
        ListNode<Integer> P2 = L2;

        while(P1 != null) {
            lenOfL1++;
            P1 = P1.next;
        }

        while(P2 != null) {
            lenOfL2++;
            P2 = P2.next;
        }

        P1 = L1;
        P2 = L2;

        if(lenOfL1 > lenOfL2) {
            for(int i = 0; i < lenOfL1-lenOfL2; i++) {
                P1 = P1.next;
            }
        } else {
            for(int i = 0; i < lenOfL2-lenOfL1; i++) {
                P2 = P2.next;
            }
        }

        while(P1 != null && P2 != null && P1 != P2) {
            P1 = P1.next;
            P2 = P2.next;
        }

        return P1;

    }
}

// Time complexity is O(N)
// Space complexity is O(1)
