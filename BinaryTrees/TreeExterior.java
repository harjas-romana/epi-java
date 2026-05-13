package BinaryTrees;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;
public class TreeExterior {
    
    public static List<BinaryTreeNode<Integer>> exteriorBinaryTree(BinaryTreeNode<Integer> tree) {

        List<BinaryTreeNode<Integer>> exterior = new ArrayList<>();
        if(tree != null) {
            exterior.add(tree);

            exterior.addAll(leftBoundaryAndLeaves(tree.left, true));

            exterior.addAll(rightBoundaryAndLeaves(tree.right, true));
        }
        return exterior;
    }

    private static List<BinaryTreeNode<Integer>> leftBoundaryAndLeaves(BinaryTreeNode<Integer> subtreeRoot, boolean isBoundary) {

        List<BinaryTreeNode<Integer>> result = new ArrayList<>();
        if(subtreeRoot != null) {
            if(isBoundary || isLeaf(subtreeRoot)) {
                result.add(subtreeRoot);
            }
            result.addAll(leftBoundaryAndLeaves(subtreeRoot.left, isBoundary));

            boolean isRightChildBoundary = isBoundary && subtreeRoot.left == null;

            result.addAll(leftBoundaryAndLeaves(subtreeRoot.right, isRightChildBoundary));
        }
        return result;
    }

    private static List<BinaryTreeNode<Integer>> rightBoundaryAndLeaves(BinaryTreeNode<Integer> subtreeRoot, boolean isBoundary) {

        List<BinaryTreeNode<Integer>> result = new ArrayList<>();

        if(subtreeRoot != null) {
            boolean isLeftChild = isBoundary && subtreeRoot.right == null;
            result.addAll(rightBoundaryAndLeaves(subtreeRoot.left, isLeftChild));

            result.addAll(rightBoundaryAndLeaves(subtreeRoot.right, isBoundary));

            if(isBoundary && isLeaf(subtreeRoot)) {
                result.add(subtreeRoot);
            }
        }
        return result;
    }
    private static boolean isLeaf(BinaryTreeNode<Integer> node) {
        return node.left == null && node.right == null;
    }
}
// Time Complexity is O(N)
// Space Complexity is O(H)