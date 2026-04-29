package BinaryTrees;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

public class RootToLeafSum {
    
    public static int rootToLeafSum(BinaryTreeNode<Integer> tree) {
        return helper(tree, 0);
    }

    private static int helper(BinaryTreeNode<Integer> tree, int partialPathSum) {

        if(tree == null) {
            return 0;
        }
        partialPathSum = (partialPathSum*2) + tree.data;

        if(tree.left == null && tree.right == null) {
            return partialPathSum;
        }
        return helper(tree.right, partialPathSum) + helper(tree.left,partialPathSum);
    }
}
// Time complexity is O(N)
// Space complexity is O(H)