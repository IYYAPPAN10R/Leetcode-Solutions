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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        helper(root,"");
        return sum;
    }
    public void helper(TreeNode root , String temp){
        if(root == null) return ;
        temp = temp+root.val;
        if(root.left == null && root.right == null){
            sum = sum+Integer.parseInt(temp,2);
            return ;
        }
        helper(root.left , temp);
        helper(root.right , temp);
        return ;
    }
}