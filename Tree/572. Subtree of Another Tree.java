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
    public boolean checkIdentical(TreeNode currentNode , TreeNode currentSubtreeNode)
    {
        if(currentNode == null && currentSubtreeNode == null)
            return true;
        else if((currentNode != null && currentSubtreeNode == null) || (currentNode == null && currentSubtreeNode != null))
            return false;
        else if(currentNode.val != currentSubtreeNode.val)
            return false;
        else
        {
            boolean leftSubtreePart = checkIdentical(currentNode.left , currentSubtreeNode.left);
            boolean rightSubtreePart = checkIdentical(currentNode.right , currentSubtreeNode.right);
            if(leftSubtreePart == true && rightSubtreePart == true)
                return true;
            
        }
        return false;
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //Do level order traversal in binary tree, whenever we encounter a node with value equivalent to root node value of subtree , we call identical function to check whether that subtree is present or not.
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(queue.isEmpty() == false)
        {
            int levelSize = queue.size(); // No of nodes in the current level.
            while(levelSize-- > 0)
            {
                TreeNode currentNode = queue.poll();
                if(currentNode.val == subRoot.val)
                {
                    if(checkIdentical(currentNode , subRoot))
                        return true;
                }
                 if(currentNode.left != null)
                   queue.add(currentNode.left);
                 if(currentNode.right != null)
                   queue.add(currentNode.right);
              
            }
        }
        return false;
    }
}
// TC : O(N)
// SC : N (queue) + Height of tree (Stack Space)
