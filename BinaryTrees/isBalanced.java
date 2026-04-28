package BinaryTrees;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

public class isBalanced {

    public static boolean isBalancedTree(BinaryTreeNode root) {
        return checkHeight(root) != 1;
    }

    public static int checkHeight(BinaryTreeNode node) {

        if(node == null) return -1;

        int leftHeight = checkHeight(node.left);
        if(leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight-rightHeight) > 1) {
            return -1;
        }
        return Math.max(rightHeight, leftHeight) + 1;
    }
}