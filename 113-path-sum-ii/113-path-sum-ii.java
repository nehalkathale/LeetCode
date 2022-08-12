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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        findpaths(root,targetSum,new ArrayList<Integer>(),paths);
        return paths;
    }
    public void findpaths(TreeNode root,int targetSum,List<Integer> current,List<List<Integer>>paths){
        if(null == root){
            return;
        }
        current.add(root.val);
        if(root.val == targetSum && root.left == null && root.right == null){
            paths.add(current);
        }
        findpaths(root.left,targetSum - root.val,new ArrayList<Integer>(current),paths);
        findpaths(root.right,targetSum - root.val,new ArrayList<Integer>(current),paths);
    }
}