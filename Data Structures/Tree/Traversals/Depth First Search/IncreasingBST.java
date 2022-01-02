class Solution {
    
    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }
    
    public TreeNode increasingBST(TreeNode root, TreeNode next) {
        if(root == null) return next;
        TreeNode r = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, next);
        return r;
    }
    
}
