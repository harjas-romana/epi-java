package BinaryTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

public class PreOrderTraversalBST {
    public static List<Integer> preOrderTraversalCode(BinaryTreeNode<Integer> tree) {
        List<Integer> result = new ArrayList<>();
        if (tree == null) {
            return result;
        }
        Deque<BinaryTreeNode<Integer>> stack = new ArrayDeque<>();
        stack.push(tree);

        while (!stack.isEmpty()) {

            BinaryTreeNode<Integer> node = stack.pop();
            result.add(node.data);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }
}
// Time complexity is O(N)
// Space complexity is O(H)