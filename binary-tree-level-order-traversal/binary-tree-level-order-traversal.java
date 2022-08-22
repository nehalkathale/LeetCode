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
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(null == root){
            return levels;
        }
        treeTraverse(root,0);
        
       
        return levels;
    }
    public void treeTraverse(TreeNode root, int level){
        if(levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(root.val);
        if(null != root.left){
                treeTraverse(root.left,level+1);
        }if(null != root.right){
                treeTraverse(root.right,level+1);
        }
        
    }
}