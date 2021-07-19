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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(0, nums.length-1, nums);
    }
    
    TreeNode createTree(int start, int end, int[] nums){
        if(start > end || end >= nums.length || start < 0) return null;
        
        int mid = (start + end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = createTree(start, mid-1, nums);
        node.right = createTree(mid+1, end, nums);
        
        return node;
    }
}