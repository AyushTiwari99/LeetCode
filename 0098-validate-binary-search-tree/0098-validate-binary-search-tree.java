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
    long min(TreeNode root)
    {
        if(root == null) return Long.MAX_VALUE;
        long left = min(root.left);
        return Math.min(left, root.val);
    }
    long max(TreeNode root)
    {
        if(root == null) return Long.MIN_VALUE;
        long right = max(root.right);
        return Math.max(right, root.val);
    }
    public boolean isValidBST(TreeNode root) 
    {
        if(root==null) return true;
        if(!(root.val > max(root.left) && root.val < min(root.right))){
            return false;
        }
        return isValidBST(root.left) && isValidBST(root.right);
        
    }
}