package BinaryTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

public class BSTInorderTraversal {
    public static List<Integer> bstInorderTraversalCode(BinaryTreeNode<Integer> tree) {

        Deque<BinaryTreeNode<Integer>> stack = new ArrayDeque<>();
        BinaryTreeNode<Integer> curr = tree;
        List<Integer> result = new ArrayList<>();

        while (!stack.isEmpty() || curr != null) {

            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                BinaryTreeNode<Integer> node = stack.pop();
                result.add(node.data);
                curr = node.right;
            }
        }
        return result;
    }
}
// Time complexity is O(N)
// Space complexity is O(H)