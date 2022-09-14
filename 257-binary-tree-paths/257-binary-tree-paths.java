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
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        construct_paths(root, "", paths);
        return paths;
    }
    public void construct_paths(TreeNode root,String path, LinkedList<String>paths){
        if(null != root){
           path += Integer.toString(root.val) ;
           if((root.left == null) && (root.right) == null)
               paths.add(path);
            else{
                path +="->";
                construct_paths(root.left,path,paths);
                construct_paths(root.right,path,paths);
            }
        }
    }
}