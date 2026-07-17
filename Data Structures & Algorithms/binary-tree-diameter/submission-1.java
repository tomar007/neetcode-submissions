
class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node) {
        if (node == null)
                return 0;

      

        diameter = Math.max(diameter, depth(node.left) + depth(node.right));  // combine both sides

        return 1 + Math.max(depth(node.left), depth(node.right));  // this node's own depth
    }
}
