package BinaryTrees;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

public class LCA {
    public static BinaryTreeNode<Integer> findLCA(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p,  BinaryTreeNode<Integer> q) {

        if(root == null) return null;

        if(root == p || root == q) return root;

        BinaryTreeNode<Integer> leftResult = findLCA(root.left,p,q);
        BinaryTreeNode<Integer> rightResult = findLCA(root.right,p,q);

        if(leftResult != null && rightResult != null) {
            return root;
        }

        return leftResult != null ? leftResult : rightResult;
    }
}
// Time complexity is O(N)
// Space complexity is O(H)