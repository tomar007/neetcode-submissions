
class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node) {
        if (node == null)
                return 0;

        int leftDepth = depth(node.left);   
        int rightDepth = depth(node.right); 

        diameter = Math.max(diameter, leftDepth + rightDepth);  // combine both sides

        return 1 + Math.max(leftDepth, rightDepth);  // this node's own depth
    }
}
