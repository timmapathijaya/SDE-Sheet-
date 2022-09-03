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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        if(root == null)
            return inorder;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root.left;
        stack.push(root);
        while(true)
        {
            if(currentNode != null)
            {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            else
            {
                if(stack.isEmpty()) 
                    break;
                TreeNode node = stack.pop();
                inorder.add(node.val);
                currentNode = node.right;
            }
        }
        return inorder;
        
    }
}
// TC : O(N)
// SC : O(Height of Tree)
