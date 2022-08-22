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
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
             traverseTree(root);
            return diameter;
        }
    
    public int traverseTree(TreeNode root){
        if(root ==null){
            return 0;
        }
        
            int leftPath = traverseTree(root.left);
            int rightPath = traverseTree(root.right);
            diameter = Math.max(leftPath+rightPath,diameter);
            return Math.max(leftPath,rightPath)+1;
        
    }
}