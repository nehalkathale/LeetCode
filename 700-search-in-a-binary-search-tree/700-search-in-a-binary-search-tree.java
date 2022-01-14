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
    public TreeNode searchBST(TreeNode root, int val) {
        
        return findElement(root,val);
    }
    public TreeNode findElement(TreeNode root,int val){
        TreeNode nodeToReturn = null;
        if(root == null){
            return null;
        }
       if(val < root.val){
            nodeToReturn = findElement(root.left,val);
        }else if(val > root.val){
            nodeToReturn = findElement(root.right,val);
        }else{
           nodeToReturn = root;
       }
        return nodeToReturn;
    }
}