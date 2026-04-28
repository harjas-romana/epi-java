package BinaryTrees;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

public class SymmetricTree {
    
    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        
        if(root == null) {
            return true;
        }

        return checkSymmetric(root.left, root.right);
    }

    public static boolean checkSymmetric(BinaryTreeNode<Integer> left, BinaryTreeNode<Integer> right) {

        if(left == null && right == null) {
            return true;
        }

        if(left == null || right == null) {
            return false;
        }

        return left.data.equals(right.data) && checkSymmetric(left.right,right.left) && checkSymmetric(left.left, right.right);

    }
}
// Time complexity is O(N)
// Space complexity is O(H)