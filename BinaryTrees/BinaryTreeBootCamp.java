package BinaryTrees;

public class BinaryTreeBootCamp {

    /**
     * The fundamental building block of a Binary Tree.
     * Often includes a 'parent' pointer as well, but standard LC problems usually only provide left/right.
     */
    public static class BinaryTreeNode<T> {
        public T data;
        public BinaryTreeNode<T> left;
        public BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * A recursive boot camp method demonstrating the three primary Depth-First Search (DFS) traversals.
     * Time Complexity: O(n) - We visit every node exactly once.
     * Space Complexity: O(h) - The call stack goes as deep as the height (h) of the tree.
     */
    public static void treeTraversal(BinaryTreeNode<Integer> root) {
        if (root != null) {
            // 1. PREORDER: Process the root BEFORE traversing the children
            System.out.println("Preorder : " + root.data);
            
            // Traverse Left Subtree
            treeTraversal(root.left);
            
            // 2. INORDER: Process the root AFTER the left child, but BEFORE the right child
            System.out.println("Inorder : " + root.data);
            
            // Traverse Right Subtree
            treeTraversal(root.right);
            
            // 3. POSTORDER: Process the root AFTER both children have been traversed
            System.out.println("Postorder : " + root.data);
        }
    }

    // A quick main method to test the logic
    public static void main(String[] args) {
        /*
         * Building a simple tree:
         * 1
         * / \
         * 2   3
         */
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        root.left = new BinaryTreeNode<>(2);
        root.right = new BinaryTreeNode<>(3);

        System.out.println("Starting Traversals:");
        treeTraversal(root);
    }
}