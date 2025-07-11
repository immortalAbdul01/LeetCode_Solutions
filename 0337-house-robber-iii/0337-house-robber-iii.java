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
    public int rob(TreeNode root) {
          int[] result = robSubtree(root);
        return Math.max(result[0], result[1]);
    }
    
    
    private int[] robSubtree(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        
        int[] left = robSubtree(node.left);
        int[] right = robSubtree(node.right);
        
        int rob = node.val + left[0] + right[0];
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]); 
        
        return new int[]{notRob, rob};

        
    }
}