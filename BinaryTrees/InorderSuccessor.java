package BinaryTrees;

public class InorderSuccessor {
    public static class Node3 {
        public int data;
        public Node3 right, left, parent;
    }

    public static Node3 inOrderSuccessor(Node3 node) {

        if (node.right != null) {
            node = node.right;

            while (node.left != null) {
                node = node.left;
            }
            return node;
        }

        while (node.parent != null && node.parent.right == node) {
            node = node.parent;
        }
        return node.parent;
    }
}
// Time complexity is O(H)
// Space complexity is O(1)