package BinaryTrees;

public class LCAWithParentPointers {
    
    public static class DemoNode {
        int data;
        DemoNode right, left, parent;
    }

    public static DemoNode computeLCA3(DemoNode node0, DemoNode node1) {

        int depth0 = getDepth(node0);
        int depth1 = getDepth(node1);

        if(depth1 > depth0) {
            DemoNode temp = node0;
            node0 = node1;
            node1 = temp;
        }

        int depthDiff = Math.abs(depth0-depth1);

        while(depthDiff-- > 0) {
            node0 = node0.parent;
        }

        while(node0 != node1) {
            node0 = node0.parent;
            node1 = node1.parent;
        }

        return node0;
    }

    private static int getDepth(DemoNode node) {
        int depth = 0;
        while(node.parent != null) {
            depth++;
            node = node.parent;
        }
        return depth;
    }
}
// Time complexity is O(N)
// Space complexity is O(1)