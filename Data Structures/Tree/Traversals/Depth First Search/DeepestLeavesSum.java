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
    public int deepestLeavesSum(TreeNode root) {
        int res = 0, i;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root); // 1st level
        while(!q.isEmpty()) {
            for(i=q.size()-1, res = 0; i>=0; i--) {
                TreeNode node = q.poll();
                res+=node.val; // get sum of the current level
                // add next level nodes to the queue
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        return res;
    }
}
