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
    
    public int sumEvenGrandparent(TreeNode root) {
        return sum(root, null,null);
    }
    
    public int sum(TreeNode root, TreeNode parent, TreeNode grandparent) {
        if(root == null) return 0;
        if(grandparent != null && grandparent.val%2 == 0) {
            return root.val + sum(root.right, root, parent) + sum(root.left, root, parent);
        }
        return sum(root.right, root, parent) + sum(root.left, root, parent);
    }
    
}
