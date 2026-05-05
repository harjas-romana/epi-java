package BinaryTrees;

import java.util.*;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

public class TreeReconstruction {

    public static BinaryTreeNode<Integer> buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inOrderMap);
    }

    public static BinaryTreeNode<Integer> helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart,
            int inEnd, Map<Integer, Integer> inOrderMap) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootValue = preorder[preStart];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootValue);

        int rootValueIndex = inOrderMap.get(rootValue);

        int leftSubtreeSize = rootValueIndex - inStart;

        root.left = helper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootValueIndex - 1,
                inOrderMap);
        root.right = helper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootValueIndex + 1, inEnd,
                inOrderMap);

        return root;
    }
}
