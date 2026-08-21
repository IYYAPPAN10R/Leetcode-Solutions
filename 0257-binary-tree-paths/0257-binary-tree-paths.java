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
    public List<String> binaryTreePaths(TreeNode root) {
        String a = "";
        return helper(root,new ArrayList<>(),a);
    }
    public List<String> helper(TreeNode root , List<String> res , String temp){
        if(root == null) return res;
        if(root.left == null && root.right == null){
            temp += root.val;
            res.add(temp);
            return res;
        }
        temp += root.val+"->";
        res = helper(root.left , res , temp = temp);
        res = helper(root.right , res ,temp =  temp);
        return res;
    }
}