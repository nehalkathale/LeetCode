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
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        traversal(root,false,false);
        return sum;
    }
    public void traversal(TreeNode node, boolean parent, boolean grandParent){
        if(node != null){
            if(grandParent){
                sum+=node.val;
            }
            traversal(node.left,node.val%2==0,parent);
            traversal(node.right,node.val%2==0,parent);
        }
    }
}