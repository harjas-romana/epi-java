package BinaryTrees;

import BinaryTrees.BinaryTreeBootCamp.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafCollector {
    
    public static List<BinaryTreeNode<Integer>> createList(BinaryTreeNode<Integer> tree) {

        List<BinaryTreeNode<Integer>> list = new ArrayList<>();
        addLeaves(tree, list);
        return list;
    }

    public static void addLeaves(BinaryTreeNode<Integer> tree, List<BinaryTreeNode<Integer>> list) {
        if(tree == null) {
            return;
        }
        
        if(isLeaf(tree)) {
            list.add(tree);
        } else {
            addLeaves(tree.left, list);
            addLeaves(tree.right, list);
        }
    }
    public static boolean isLeaf(BinaryTreeNode<Integer> tree) {
        if(tree.right == null && tree.left == null) return true;
        return false;
    }
}
