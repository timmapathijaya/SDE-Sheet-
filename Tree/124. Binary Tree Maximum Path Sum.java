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
class PathSum
{
    int maxPathSum;
    public PathSum(int maxPathSum)
    {
        this.maxPathSum = maxPathSum;
    }
}
class Solution {
    public int maxPathSum(TreeNode root) {
        PathSum sum = new PathSum(Integer.MIN_VALUE);
        maxPath(root , sum);
        return sum.maxPathSum;
    }
    public int maxPath(TreeNode currentNode , PathSum sum)
    {
        if(currentNode == null)
            return 0;
        
        int leftSubtreeSum = maxPath(currentNode.left , sum);
        int rightSubtreeSum = maxPath(currentNode.right , sum);
        
        // Considering a -ve Path sum will never give me Max Path Sum.
        if(leftSubtreeSum < 0) 
            leftSubtreeSum = 0;
        if(rightSubtreeSum < 0)
            rightSubtreeSum = 0;
        
        // Considering that node is the curving point of the path.     
        sum.maxPathSum = Math.max(sum.maxPathSum , currentNode.val + leftSubtreeSum + rightSubtreeSum);
        
        return currentNode.val + Math.max(leftSubtreeSum , rightSubtreeSum);
    }
}
// TC : O(N) 
// SC : O(Height of the tree)[stack space]

