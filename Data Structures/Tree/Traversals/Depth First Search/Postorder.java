class Solution {
    List<Integer> arr = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        if(root == null) return arr;
        for(Node n : root.children) postorder(n);
        arr.add(root.val);
        return arr;
    }
}
