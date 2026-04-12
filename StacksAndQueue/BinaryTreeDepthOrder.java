package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeDepthOrder {
    public static List<List<Integer>> binaryTreeDepthOrder(BinaryTreeNode<Integer> tree) {

        List<List<Integer>> result = new ArrayList<>();
        if(tree == null) return result;

        Queue<BinaryTreeNode<Integer>> queue = new ArrayDeque<>();
        queue.add(tree);

        while(!queue.isEmpty()) {

            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();


            for(int i = 0; i < levelSize; i++) {
                BinaryTreeNode<Integer> curr = queue.poll();
                currentLevel.add(curr.data);

                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            result.add(currentLevel);
        }
        return result;
    }
}
