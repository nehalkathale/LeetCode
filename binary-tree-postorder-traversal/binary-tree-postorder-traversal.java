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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> listToReturn = new ArrayList<>();
        helper(root,listToReturn);
        return listToReturn;
    }
    public void helper(TreeNode root,List<Integer> listToReturn){
        if(null != root){
            helper(root.left,listToReturn);
            helper(root.right,listToReturn);
            listToReturn.add(root.val);
        }
        
    }
}