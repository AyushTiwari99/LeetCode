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
    int ans = 0, maxsum = 0;
}
class Solution {
    int maxs = 0;
    public Pair validate(TreeNode root) {
		if(root == null) return new Pair();
		Pair leftPair = validate(root.left);
		Pair rightPair = validate(root.right);
		Pair selfPair = new Pair();
		selfPair.min = Math.min(leftPair.min, Math.min(rightPair.min, root.val));
		selfPair.max = Math.max(leftPair.max, Math.max(rightPair.max, root.val));
		if(leftPair.isbst && rightPair.isbst && leftPair.max < root.val && root.val < rightPair.min) {
			selfPair.isbst=true;
            selfPair.ans = leftPair.ans + rightPair.ans + root.val;
            maxs = Math.max(maxs, selfPair.ans);
		}
		else {
			selfPair.isbst=false;
		}
		return selfPair;
	}
    public int maxSumBST(TreeNode root) {
        validate(root);
        return maxs;
    }
}