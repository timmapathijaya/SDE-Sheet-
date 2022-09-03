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
    // Inorder ( Left , Root , Right )
    public void inordertraversal(TreeNode node , List<Integer> inorder)
    {
        if(node == null)
            return;
        inordertraversal(node.left , inorder);
        inorder.add(node.val);
        inordertraversal(node.right , inorder);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inordertraversal(root , inorder);
        return inorder;
        
    }
}
// TC : O(N)
// SC : O(Height of tree)
