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
    TreeNode big=null, small=null, prev=null;
    public void recoverTree(TreeNode root) 
    {
        inorder(root);
        int temp=big.val;
        big.val=small.val;
        small.val=temp;
    }
    void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && prev.val>root.val)
        {
            if (big==null) big=prev;
            small=root;
        }
        prev=root;
        inorder(root.right);
    }
}