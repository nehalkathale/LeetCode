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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
        return maxDiameter;
    }
    private int  calculateDiameter(TreeNode node){
        if(null == node){
            return -1;
        }
        int leftHeight = calculateDiameter(node.left);
        int rightHeight = calculateDiameter(node.right);
        if (leftHeight + rightHeight + 2 > maxDiameter) {
            maxDiameter = leftHeight + rightHeight + 2;
        }
        return  1 + Math.max(leftHeight, rightHeight);
    }
}