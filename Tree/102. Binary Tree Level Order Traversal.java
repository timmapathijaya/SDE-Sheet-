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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> LevelOrder = new ArrayList<>();
        if(root == null)
          return LevelOrder;
      
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
      
        while(queue.isEmpty() == false)
        {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
          
            for(int i = 1 ; i <= levelSize ; i++)
            {
                TreeNode node = queue.remove();
                if(node.left != null)
                  queue.add(node.left);
                if(node.right != null)
                  queue.add(node.right);
                level.add(node.val);   
            }
          
            LevelOrder.add(level);
        }
        return LevelOrder;
    }
}
// TC : O(N)
// SC : O(N)
