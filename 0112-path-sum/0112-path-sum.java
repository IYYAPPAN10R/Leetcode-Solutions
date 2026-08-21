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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum);
    }
    public boolean helper(TreeNode root , int tar){
        if(root == null) return false;
        
        if(root.val == tar && root.left == null && root.right == null) return true;
        tar = tar-root.val;
        return helper(root.left,tar) || helper(root.right,tar);
        
    }
}