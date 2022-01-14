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
    List<Integer> listToReturn = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return listToReturn;
        
        
    }
    private void traverse(TreeNode root){
        if(root == null)
            return;
        else{
            traverse(root.left);
            listToReturn.add(root.val);
            traverse(root.right);
        }
    }
}