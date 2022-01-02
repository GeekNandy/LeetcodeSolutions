class Solution {
    
    List<TreeNode> arr = new ArrayList<>();
    
    public TreeNode balanceBST(TreeNode root) {
        inOrderTraversal(root);
        return getTreeFromList(0, arr.size() - 1);
    }
    
    void inOrderTraversal(TreeNode root) {
        if(root == null) return;
        if(root.left != null) inOrderTraversal(root.left);
        arr.add(root);
        if(root.right != null) inOrderTraversal(root.right);
    }
    
    TreeNode getTreeFromList(int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = arr.get(mid);
        root.left = getTreeFromList(start, mid - 1);
        root.right = getTreeFromList(mid + 1, end);
        return root;
    }
}
