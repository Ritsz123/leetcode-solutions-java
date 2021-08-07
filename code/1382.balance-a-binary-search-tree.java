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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        
        return consTree(arr, 0, arr.size()-1);
    }
    
    TreeNode consTree(ArrayList<Integer> arr, int start, int end) {
        if(start > end) return null;
        
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        
        root.left = consTree(arr, start, mid-1);
        root.right = consTree(arr, mid+1, end);
        
        return root;
    }
    
    
    void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
}