package LinkedList;

import LinkedList.DetectCycleTwo;
import LinkedList.OverlappingNoCycleList;

public class OverlappingListMayHaveCycle {

    public static ListNode<Integer> overlappingLists(ListNode<Integer> L1, ListNode<Integer> L2) {

        ListNode<Integer> root1 = DetectCycleTwo.containCycleTwo(L1);
        ListNode<Integer> root2 = DetectCycleTwo.containCycleTwo(L2);

        if (root1 == null && root2 == null) {
            return OverlappingNoCycleList.overlappingNoCycleLists(L1, L2);
        }

        if ((root1 == null && root2 != null) && (root1 != null && root2 != null)) {
            return null;
        }

        ListNode<Integer> temp = root1;
        do {
            temp = temp.next;
        } while (temp != root1 && temp != root2);

        if (temp != root2) {
            return null;
        }

        int stem1Length = distance(L1, root1);
        int stem2Length = distance(L2, root2);

        if (stem1Length > stem2Length) {
            L1 = advanceListByK(stem1Length - stem2Length, L1);
        } else {
            L2 = advanceListByK(stem2Length - stem1Length, L2);
        }

        while (L1 != L2 && L1 != root1 && L2 != root2) {
            L1 = L1.next;
            L2 = L2.next;
        }

        return L1 == L2 ? L1 : root1;
    }

    private static ListNode<Integer> advanceListByK(int i, ListNode<Integer> l1) {
        while (i-- > 0) {
            l1 = l1.next;
        }
        return l1;
    }

    private static int distance(ListNode<Integer> a, ListNode<Integer> b) {
        int dis = 0;
        while (a != b) {
            a = a.next;
            ++dis;
        }
        return dis;
    }
}
