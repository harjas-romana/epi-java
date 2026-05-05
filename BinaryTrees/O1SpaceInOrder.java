package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class O1SpaceInOrder {

    public static class Node4 {
        public int data;
        Node4 right, left, parent;
    }

    public static List<Integer> code(Node4 tree) {
        Node4 prev = null;
        Node4 curr = tree;
        List<Integer> result = new ArrayList<>();

        while (curr != null) {
            Node4 next;

            if (curr.parent == prev) {
                if (curr.left != null) {
                    next = curr.left;
                } else {
                    result.add(curr.data);
                    next = (curr.right != null) ? curr.right : curr.parent;
                }
            } else if (curr.left == prev) {
                result.add(curr.data);

                next = (curr.right != null) ? curr.right : curr.parent;
            } else {
                next = curr.parent;
            }
            prev = curr;
            curr = next;
        }
        return result;
    }
}
