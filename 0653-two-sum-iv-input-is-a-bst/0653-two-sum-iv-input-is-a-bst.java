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
    public boolean findTarget(TreeNode root, int k) {
        return helper(root , k , new ArrayList<>());
    }
    public boolean helper(TreeNode root,int k, ArrayList<Integer> a){
        if(root == null) return false;
        if(a.contains(k-root.val)) return true;
        a.add(root.val);
        return helper(root.left , k , a) || helper(root.right , k , a);
    }
}