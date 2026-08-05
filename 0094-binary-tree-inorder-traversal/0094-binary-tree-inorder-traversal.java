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
    public List<Integer> inorderTraversal(TreeNode root) {
        return helper(root , new ArrayList<>());
    }
    public List<Integer> helper(TreeNode root , List<Integer> a){
        if(root == null) return a;
        helper(root.left,a);
        a.add(root.val);
        helper(root.right,a);
        return a;
    }
}