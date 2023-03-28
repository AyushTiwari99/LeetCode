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
    List<Integer> l1;
    public int kthSmallest(TreeNode root, int k) 
    {
        l1= new ArrayList<>();
        inorder(root);
        Collections.sort(l1);
        return l1.get(k-1);
    }
    void inorder(TreeNode root)
    {
        if(root==null )return;
        inorder(root.left);
        inorder(root.right);
        l1.add(root.val);
    }
}