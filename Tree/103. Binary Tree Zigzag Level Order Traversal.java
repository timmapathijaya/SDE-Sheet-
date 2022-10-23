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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigZagTraversal = new ArrayList<>();
        if(root == null)
         return zigZagTraversal;
        
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        boolean leftToRight = true;
        
        while(deque.isEmpty() == false)
        {
            int currentLevelSize = deque.size();
            List<Integer> Level = new ArrayList<>();
            if(leftToRight == true)
            {
                while(currentLevelSize-- > 0 )
                {
                   TreeNode currentNode = deque.pollLast();
                   Level.add(currentNode.val);
                    
                   if(currentNode.left != null)
                       deque.addFirst(currentNode.left);
                   if(currentNode.right != null)
                       deque.addFirst(currentNode.right);
                }
            }
            else
            {
                 while(currentLevelSize-- > 0 )
                 {
                   TreeNode currentNode = deque.pollFirst();
                   Level.add(currentNode.val);
                     
                   if(currentNode.right != null)
                      deque.addLast(currentNode.right);
                   if(currentNode.left != null)
                      deque.addLast(currentNode.left); 
                 

                } 
            }
            zigZagTraversal.add(Level);
            leftToRight = !leftToRight;
        }
        return zigZagTraversal;
    }
}
