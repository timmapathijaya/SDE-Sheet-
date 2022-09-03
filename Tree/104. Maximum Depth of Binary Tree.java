/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int heightOfTree(TreeNode node)
    {
        if(node == null)
            return 0;
        int leftSubtreeHeight = heightOfTree(node.left);
        int rightSubtreeHeight = heightOfTree(node.right);
        return 1 + Math.max(leftSubtreeHeight , rightSubtreeHeight);
    }
    // TC : O(N)
    // SC : O(Height of Tree)
    
    public int maxDepth(TreeNode root) {
        return heightOfTree(root);
    }
}
