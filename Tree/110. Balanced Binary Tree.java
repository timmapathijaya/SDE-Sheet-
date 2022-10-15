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
    public int checkBalanced(TreeNode node)
    {
        if(node == null)
            return 0;
        int left = checkBalanced(node.left);
        if(left == -1) // not balanced
            return -1;
        int right = checkBalanced(node.right);
        if(right == -1) // not balanced
            return -1;
        // both substrees are balanced & know check for the current node
        if(Math.abs(left - right) > 1) // Not Balanced
            return -1;
        return  1 + Math.max(left , right);
        
    }
    // TC : O(N)
    // SC : O(Height of tree) [Stack Space]
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        // Optimised Approach
        // if balanced condition satisfied for node return height of that node
        // else return -1
        if(checkBalanced(root) == -1)
            return false;
        return true;
    }
}
