
class Solution {
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return dia;
    }
    public int helper(TreeNode root){
        if(root  == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        dia = Math.max(dia , left+right);
        return 1+Math.max(left,right);
    }
}