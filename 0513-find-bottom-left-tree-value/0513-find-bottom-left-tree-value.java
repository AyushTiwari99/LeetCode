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
class Solution 
{
    int maxlvl;
    int val;
    public int findBottomLeftValue(TreeNode root) {
        maxlvl=0;
        val=root.val;
        goDFS(root, 0);
        return val;
    }

    private void goDFS(TreeNode node, int lvl) {
        if (node == null) return;
        if (maxlvl <= lvl) {
            maxlvl = lvl;
            val = node.val;
        }
        lvl++;
        goDFS(node.right, lvl);
        goDFS(node.left, lvl);
    }
}