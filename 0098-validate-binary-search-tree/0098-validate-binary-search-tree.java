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
class Pair{
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    boolean isbst = true;
}
class Solution {
    public Pair validate(TreeNode root){
        if(root == null) return new Pair();
        Pair left = validate(root.left);
        Pair right = validate(root.right);
        Pair self = new Pair();
        self.min = Math.min(left.min ,Math.min(right.min, root.val));
        self.max = Math.max(left.max ,Math.max(right.max, root.val));
        if(left.isbst && right.isbst && left.max < root.val && root.val < right.min){
            self.isbst = true;
        }
        else self.isbst = false;
        return self;
        
    }
    public boolean isValidBST(TreeNode root) 
    {
        return validate(root).isbst;
        
    }
}