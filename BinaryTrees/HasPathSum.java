package BinaryTrees;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

public class HasPathSum {
    public static boolean hasPathSumCode(BinaryTreeNode<Integer> tree, int targetSum) {
        if(tree == null) {
            return false;
        }
        targetSum -= tree.data;

        if(tree.right == null && tree.left == null) {
            return targetSum == 0;
        }
        return hasPathSumCode(tree.right, targetSum) || hasPathSumCode(tree.left, targetSum);
    }
}
// Time complexity is O(N)
// Space complexity is O(H)