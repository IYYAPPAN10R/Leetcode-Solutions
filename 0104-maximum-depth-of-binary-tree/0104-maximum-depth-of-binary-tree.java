/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
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
    public int maxDepth(TreeNode root) {
        int max = 0;
        int crr = 0;
        return helper(root , max , crr);
    }
    public int helper(TreeNode root , int max , int curr){
        if(root == null){
            max = Math.max(max,curr);
            curr = curr-1;
            return max;
        }
        max = helper(root.left,max,curr+1);
        max = helper(root.right,max,curr+1);
        return max;
    }
}