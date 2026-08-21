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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return helper(root , Integer.MAX_VALUE , 1);
    }
    public int helper(TreeNode root , int min ,int depth){
        if(root == null) return min;
        if(root.left == null && root.right == null){
            return min = Math.min(min , depth);
        }
        min = Math.min(min,helper(root.left , min , depth+1));
        min = Math.min(min , helper(root.right, min , depth+1));
        return min;
    }
}