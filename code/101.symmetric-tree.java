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
    public boolean isSymmetric(TreeNode root) {
        int level = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int[] arr = new int[size];
            int x = 0;
            for(int i = 0;i< size;i++,x++){
                TreeNode curr = q.remove();
                if(curr != null){
                    arr[x] = curr.val;
                    q.add(curr.left);
                    q.add(curr.right);    
                }else{
                    arr[x] = -1;
                }
                
            }
            x = 0;
            int y = size-1;
            while(x<y){
                if(arr[x] != arr[y]){
                    return false;
                }
                x++;
                y--;
            }
        }
        return true;
    }
}