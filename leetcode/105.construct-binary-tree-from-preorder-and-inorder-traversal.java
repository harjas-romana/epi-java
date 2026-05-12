/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 */

// @lc code=start

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inOrderMap);
    }

    public static TreeNode helper(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd,
            Map<Integer, Integer> inOrderMap) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootValue = preOrder[preStart];
        TreeNode root = new TreeNode(rootValue);

        int rootValueIndex = inOrderMap.get(rootValue);

        int leftSubtreeSize = rootValueIndex - inStart;

        root.left = helper(preOrder, preStart + 1, preStart + leftSubtreeSize, inOrder, inStart, rootValueIndex - 1,
                inOrderMap);

        root.right = helper(preOrder, preStart + leftSubtreeSize + 1, preEnd, inOrder, rootValueIndex + 1, inEnd,
                inOrderMap);
        return root;
    }
}
// @lc code=end
