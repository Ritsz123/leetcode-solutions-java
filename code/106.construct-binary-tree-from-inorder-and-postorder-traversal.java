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
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length - 1;
        if(idx < 0) return null;
        return construct(inorder, postorder, 0, idx);
    }
    
    TreeNode construct(int[] inorder, int[] postorder, int start, int end){
        if(start > end){
            return null;
        }
        
        TreeNode curr = new TreeNode(postorder[idx]);
        
        int pos = search(inorder, start,end, postorder[idx]);
        idx--;
        
        curr.right = construct(inorder, postorder, pos + 1, end);
        curr.left = construct(inorder, postorder, start, pos-1);
        return curr;
    }
    
    int search(int[] inorder, int start, int end, int val){
        for(int i = start; i<=end; i++){
            if(inorder[i] == val){
                return i;
            }
        }
        return -1;
    }
}