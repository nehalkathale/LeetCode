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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = inorder(root,new ArrayList<Integer>());
        return nums.get(k-1);
    }
    public ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> array){
        if(root == null){
            return array;
        }
        inorder(root.left,array);
        array.add(root.val);
        inorder(root.right,array);
        return array;
    }
}